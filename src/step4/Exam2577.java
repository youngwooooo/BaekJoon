package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-29 **
 *
 * - 백준 2577번 : 숫자의 개수
 *
 * - 이해하기
 * : 세 수를 곱한 값을 통해 첫째 줄에는 0이 사용된 횟수, 둘째 줄 ~ 열 번째 줄까지는 1 ~ 9까지 각 숫자가 사용된 횟루를 출력
 *   => 즉, 줄을 구분할 필요 없이 0 ~ 9까지 각 숫자가 사용된 횟수 모두를 차례대로 출력하면 된다.
 *
 * - 해결방법
 * 1) 세 수(a, b, c)를 입력 받는다.
 * 2) 세 수의 곱의 값(multiple)을 얻는다.
 * 3) 세 수의 곱을 문자열로 변환하고 하나씩 잘라서 문자열 배열(strArr)을 만든다.
 * 4) 0 ~ 9까지의 숫자가 쓰여진 횟수를 저장하기 위한 배열(count)을 만든다.
 * 5) 숫자 횟수 배열(count)과 문자열 배열(strArr)을 이중 for문으로 돌린다.
 *    -> count의 인덱스(i)와 strArr[j]의 값을 비교한다.
 *    -> 같다면 count[i]의 값을 1씩 증가시킨다.
 *    -> i번 째 for문이 끝날 때 마다 StringBuilder 객체(sb)에 count[i]의 값을 append한다.
 * 6) 결과를 출력한다.
 */
public class Exam2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int multiple = a * b * c;

        String[] strArr = String.valueOf(multiple).split("");
        int[] count = new int[10];

        for(int i=0; i<count.length; i++){
            for(int j=0; j<strArr.length; j++){
                if(i == Integer.parseInt(strArr[j])){
                    count[i]++;
                }
            }

            sb.append(count[i] + "\n");
        }

        System.out.println(sb);

    }
}
