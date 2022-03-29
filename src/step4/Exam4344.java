package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 ** 2022-03-29 **
 *
 * - 백준 4344번 : 평균은 넘겠지
 *
 * - 이해하기
 * : 입력받은 학생 수와 학생의 성적으로 평균 성적을 구하고, 평균 성적보다 높은 성적을 가진 학생의 수를 구한다.
 *   평균 성적보다 높은 성적을 가진 학생의 수를 통해 비율을 구한다.
 *   => 즉, 최종적으로 '(평균 성적보다 높은 성적을 가진 학생의 수 / 학생의 수) * 100'의 결과를 출력해야한다.
 *
 * - 해결방법
 * 1) 입력받은 테스트 케이스의 수(n)만큼 for문을 돌린다.
 * 2) 입력받은 테스트 케이스로 학생 수(student)를 구한다.
 * 3) 학생 수의 크기만큼 성적을 담을 배열(arr)을 생성한다.
 * 4) 입력받은 테스트 케이스로 성적을 성적 배열(arr)에 저장하고 성적 합계(sum)를 구한다.
 * 5) 평균 성적(avg)을 구한다.
 * 6) 성적 배열(arr)에서 arr[i]가 평균 성적(avg)보다 높다면 평균 성적보다 높은 성적을 가진 학생 수(count)를 증가시킨다.
 * 7) 평균 성적을 넘는 학생의 비율을 구한다.(result)
 * 8) 결과 출력
 *
 * - 주의사항
 * : 평균 성적을 넘는 학생의 비율(result)를 구하고 나서 출력 예시처럼 소수점을 계산하려고 Math.round() 사용하여 출력할 경우 에러 발생!
 *   -> String.format()을 사용하자.
 */
public class Exam4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int student = Integer.parseInt(st.nextToken());
            arr = new int[student];
            int sum = 0;

            for(int j=0; j<arr.length; j++){
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }

            double avg = sum / student;
            int count = 0;

            for(int j=0; j<arr.length; j++){
                if(avg < arr[j]){
                    count++;
                }
            }

            double result = ((double) count /  student) * 100;
            System.out.println(String.format("%.3f", result)+"%");
        }
    }
}
