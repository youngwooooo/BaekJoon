package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-30 **
 *
 * - 백준 11654번 : 아스키 코드
 *
 * - 이해하기
 * : 숫자, 알파벳 대소문자를 입력받았을 때 해당 입력받은 값을 아스키 코드로 출력
 *
 * - 해결방법
 * : 입력받은 값은 하나의 문자이므로 charAt(0)을 통해 첫째 문자를 뽑아오고 int로 형변환을 통해 아스키 코드 값으로 출력
 */
public class Exam11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int) br.readLine().charAt(0));

    }
}
