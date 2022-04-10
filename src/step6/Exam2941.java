package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-31 **
 *
 * - 백준 2941번 : 크로아티아 알파벳
 *
 * - 이해하기
 * : 입력받은 문자열(s)이 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
 *   조건에 따라 2개의 문자열로 보여도 1개의 문자열로 처리한다.
 *   즉, 길이 2이상인 문자를 길이 1로 친다.
 *
 * - 해결방법
 *  1) 변경된 크로아티아 알파벳 배열(arr) 생성
 *  2) 변경된 크로아티아 알파벳 배열(arr)의 길이만큼 for문을 돌린다.
 *     -> 입력받은 문자열(s)가 arr[i] 값을 포함한다면 replaceAll()을 톻해 해당 문자를 '#'으로 치환한다.
 *        (replaceAll() 사용 이유 : c=c=와 같이 중복이 있다면 모두 치환해야 하기 때문)
 *     -> 길이가 2이상이었던 크로아티아 알파벳(c=, c-, dz= ...)를 '#'으로 치환했기 때문에 길이는 1이다.(조건 성립)
 *
 *  3) 문자열(s) 길이를 출력한다.
 */
public class Exam2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<arr.length; i++){
            if(s.contains(arr[i])){
                s = s.replaceAll(arr[i], "#");
            }
        }

        System.out.println(s.length());

    }
}
