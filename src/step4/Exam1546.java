package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 ** 2022-03-29 **
 *
 * - 백준 1546번 : 평균
 *
 * - 이해하기
 * : 첫째 줄 = 과목 수, 둘째 줄 = 성적(과목수 만큼)을 입력받고 성적 중 가장 최대 값으로 모든 성적을 나눈 후에 100을 곱해준다.
 *   해당 결과를 모두 더하고 새로운 평균을 출력한다.
 *   즉, 성적 중 최대 값을 찾아서 (각 성적/최대 성적)*100을 해주고 모두 더해준 후 과목 수로 나눠 평균구하기
 *
 * - 해결방법
 * 1) 성적을 담을 배열(arr)을 생성한다.
 * 2) 입력 값을 통해 받은 성적을 해당 배열에 저장한다
 * 3) 해당 배열을 오름차순으로 정렬한다.
 * 4) 성적 중 최대 값(max)를 구한다.
 * 5) for문을 통해 성적 배열(arr)을 돌려 각 성적을 최대 성적으로 나눈 후 100을 곱한 값을 모두 더한다.(sum) -> (arr[i] / max) * 100
 * 6) 성적의 합(sum)을 성적 배열 길이(arr.length)로 나누어 평균 점수(avg)를 구한다. -> max / arr.length
 * 7) 결과 출력
 */
public class Exam1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());;
        double[] arr = new double[n];

        for(int i=0; i<n; i++){
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input;
        }
        Arrays.sort(arr);

        double max = arr[arr.length - 1];
        double sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += (arr[i] / max) * 100;
        }

        double avg = sum / arr.length;

        System.out.println(avg);

    }
}
