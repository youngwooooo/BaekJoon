package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-30
 *
 * - 백준 1065번 : 한수
 *
 * - 이해하기
 * : 등차수열 = 연속하는 두 수(항)의 차이가 모두 일정한 수
 *            n번째 수(n번째 항) = 첫번째 수(초항) + (n-1) * d(앞, 뒤 두 수(항)의 차)
 *   한수 = 각 정수 X의 각 자리가 등차수열을 이루는 수
 *   1 ~ 99까지는 등차수열이다. 비교할 수 있는 자리수가 없다.
 *   -> 1 ~ 9까지는 각각의 수 자체가 수열에 속한다.
 *   -> 10 ~ 99까지는 각 자리수의 차이가 공차인 수열이다.
 *      ex) 10 -> 1 0 / 공차(1-0)가 1인 등차수열
 *          11 -> 1 1 / 공차(1-1)가 0인 등차수열
 *          12 -> 1 2 / 공차(1-2)가 -1인 등차수열
 *   즉, 최소 3자리 수부터 비교를 통해 등차수열을 판별할 수 있다.
 *   -> 각 자리수가 a, b, c일 때
 *      ex) 100 -> 1(a) 0(b) 0(c) -> ( 1(a) - 0(b) ) != ( 0(b) - 0(c) ) => 100은 등차수열이 아님
 *          101 -> 1(a) 0(b) 1(c) -> ( 1(a) - 0(b) ) != ( 0(b) - 1(c) ) => 101은 등차수열이 아님
 *          123 -> 1(a) 2(b) 3(c) -> ( 1(a) - 2(b) ) == ( 2(b) - 3(c) ) => 123은 공차가 1인 등차수열임
 *
 * - 해결방법
 * 1) 한수의 개수를 return하는 함수(han()) 생성
 *   -> 한수의 개수(count) 변수 선언 및 초기화(0)
 *   -> 자연수 N(n)이 100보다 작으면 한수의 개수(count)는 자연수(n)와 같으므로 count = n
 *   -> 자연수 N(n)이 100보다 크면 1 ~ 99까지의 한수의 개수는 99개이므로 count = 99
 *   -> 100 ~ n까지의 for문을 돌려서 첫째자리 수(a), 둘째자리 수(b), 셋째자리 수(c)를 구한다.
 *   -> ( 첫째자리 수(a) - 둘째자리 수(b) )가 ( 둘째자리 수(b) - 셋째자리 수(c) )와 같으면 count를 1씩 증가시킨다.
 *   -> count를 return한다.
 *
 *  2) 한수의 개수를 return하는 함수(han()) 실행 및 결과 출력
 */
public class Exam1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 자연수 N
        System.out.println(han(n));
    }

    public static int han(int n){
        int count = 0; // 한수의 개수

        if(n < 100){
            count = n;
        }else {
            count = 99; // 1 ~ 99까지 한수의 개수

            for(int i=100; i<=n; i++){
                int a = i / 100;        // 첫째자리 수(백)
                int b = (i / 10) % 10;  // 둘째자리 수(십)
                int c = (i % 10);       // 셋째자리 수(일)

                if(a - b == b - c){
                    count++;
                }
            }
        }

        return count;
    }
}
