package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-30 **
 *
 * - 백준 10809번 : 알파벳 찾기
 *
 * - 이해하기
 * : 입력받는 단어(s)에서 a ~ z까지 각 알파벳이 처음 등장하는 위치를 공백으로 구분해서 출력
 *
 * - 해결방법
 * 1) 단어를 입력받는다.(s)
 * 2) a ~ z까지 for문을 돌리면서 indexOf()를 활용해 각 알파벳의 인덱스 위치를 구한다.
 *   -> indexOf() : 값이 존재하지 않으면 -1을 return
 *                  값이 존재한다면 값이 존재하는 인덱스의 위치를 return
 *   ex) s = baekjoon
 *       s.indexOf('a') -> 1
 *       s.indexOf('b') -> 0
 *       s.indexOf('c') -> -1
 * 3) StringBuilder 객체에 담기
 * 4) 결과 출력
 */
public class Exam10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for(char i='a'; i<='z'; i++){
            sb.append(s.indexOf(i)).append(" ");
        }

        System.out.println(sb);
    }
}
