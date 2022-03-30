package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 ** 2022-03-30 **
 *
 * - 백준 2675번 : 문자열 반복
 *
 * - 이해하기
 * : 각 테스트 반복 횟수(r)와 문자열(s)를 구분하고 문자열을 한 글자씩 테스트 반복 횟수(r)만큼 출력한다.
 *
 * - 해결방법
 * 1) 테스트 케이스 개수(t) 입력 받기
 * 2) 테스트 케이스 개수(t)만큼 for문을 돌린다.
 *    -> 각 테스트 케이스 반복 횟수(r)와 문자열(s)를 구분한다.
 *    -> 문자열(s)의 길이만큼 for문을 돌리고 그 안에서 각 테스트 케이스 반복 횟수(r)만큼 이중 for문을 돌린다.
 *       -> charAt()을 활용하여 문자열을 한 글자씩 가져와서 각 테스트 케이스 반복 횟수(r)만큼 StringBuilder 객체에 더해준다.
 * 3) 결과 출력
 */
public class Exam2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()); // 각 테스트 케이스 반복 횟수
            String s = st.nextToken(); // 문자열

            for(int j=0; j<s.length(); j++){
                for(int k=0; k<r; k++){
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
