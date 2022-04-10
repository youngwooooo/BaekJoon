package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-31 **
 *
 * - 백준 5622번 : 다이얼
 *
 * - 이해하기
 * : 알파벳 대문자 문자열(s)을 입력받는다.(2 <= s.length <= 15)
 *   각 숫자에 해당하는 알파벳들이 있다.
 *   숫자 1을 걸기 위해선 2초가 필요하다. -> 숫자 n을 걸기 위해서는 n+1초가 필요하다.
 *   즉, 주어진 문자열에서 알파벳을 하나씩 체크해서 해당 알파벳이 위치하고 있는 숫자를 걸기위한 시간을 누적해서 더한 값을 출력한다.
 *
 * - 해결방법
 * 1) 입력받은 문자열(s)만큼 for문을 돌린다.
 *    -> charAt()을 활용하여 문자를 하나씩 가져온다.(str)
 *    -> switch ~ case문을 돌려 각 알파벳의 경우에 걸기위한 시간을 누적한다.(time)
 * 2) 결과 출력
 */
public class Exam5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int time = 0;

        for(int i=0; i<s.length(); i++){
            char str = s.charAt(i);

            switch (str){
                case 'A': case 'B': case 'C':
                    time += 3;
                    break;
                case 'D': case 'E': case 'F':
                    time += 4;
                    break;
                case 'G': case 'H': case 'I':
                    time += 5;
                    break;
                case 'J': case 'K': case 'L':
                    time += 6;
                    break;
                case 'M': case 'N': case 'O':
                    time += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    time += 8;
                    break;
                case 'T': case 'U': case 'V':
                    time += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    time += 10;
                    break;
            }
        }

        System.out.println(time);
    }
}
