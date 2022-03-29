package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-29 **
 *
 * - 백준 8958번 : OX퀴즈
 *
 * - 이해하기
 * : 0, X를 입력받는데, O는 문제를 맞춘 것이고 X는 문제를 틀린 것이고 문제의 점수는 연속된 O의 개수이다.
 *   즉, O가 연속해서 있을 때는 O의 값은 1씩 증가하면서 누적되고 중간에 X를 만나면 0으로 초기화된다.
 *
 * - 해결방법
 * 1) n개의 길이(입력 받는 테스트 케이스 개수)만큼의 문자열 배열(arr)을 생성한다.
 * 2) 해당 배열에 입력받은 문자열(테스트 케이스)를 저장한다.
 * 3) 문자열 배열(arr)길이 만큼 for문을 돌리고 arr[i]길이 만큼 이중 for문을 돌린다.
 *    -> 점수(score), 합계(sum)을 0으로 초기화
 *    -> arr[i]를 하나씩 꺼내어 비교한다.
 *      ('O'일 경우 점수(score)를 1씩 증가시키고 합계(sum)에 누적해서 더해준다. / 'X'일 경우 점수를 0으로 초기화)
 *    -> 큰 for문이 끝날 때마다 StringBuilder 객체(sb)에 합계(sum)을 담는다.
 * 4) 결과 출력
 */
public class Exam8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            String ox = br.readLine();
            arr[i] = ox;
        }

        int score;
        int sum;

        for(int i=0; i<arr.length; i++){
            score = 0;
            sum = 0;

            for(int j=0; j<arr[i].length(); j++){
                char ch = arr[i].charAt(j);

                if(String.valueOf(ch).equals("O")){
                    score++;
                    sum += score;
                }else{
                    score = 0;
                }
            }

            sb.append(sum + "\n");
        }

        System.out.println(sb);
    }
}
