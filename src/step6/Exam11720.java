package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-30
 *
 * - 백준 11720번 : 숫자의 합
 *
 * - 이해하기
 * : 한 줄로 입력받은 숫자를의 합을 출력
 *
 * - 해결방법
 * 1) BufferedReader 객체의 readLine()을 통해 한 줄로 숫자를 입력받는다.
 * 2) for문을 통해 getBytes()로 한 숫자씩 아스키코드로 변환하여 값(b)을 가져온다.
 * 3) 아스키코드로 변환된 숫자의 값(b)에서 '0' 또는 48을 빼주고 sum에 누적시켜서 더해준다.
 * 4) 결과 출력
 */
public class Exam11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(byte b : br.readLine().getBytes()){
            sum += b - 48;
        }

        System.out.println(sum);
    }
}
