package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-31 **
 *
 * - 백준 1157번 : 단어 공부
 *
 * - 이해하기
 * : 알파벳 대,소문자로 입력받는 문자열에서 가장 많이 사용된 알파벳을 대문자로 출력
 *   가장 많이 사용된 알파벳이 여러 개 있을 경우 '?'를 출력
 *
 * - 해결방법
 * 1) 길이가 알파벳 수와 같은 배열(alphabet) 생성
 * 2) 입력받은 문자열의 길이만큼 for문을 돌린다.
 *    -> charAt()을 한 글자씩 가져와서 'A'를 빼서 idx에 저장
 *    -> 알파벳 배열(alphabet)의 인덱스가 idx인 값을 1씩 증가
 * 3) 최대 값(max), 결과를 저장할 변수(result) 선언 및 초기화
 * 4) 알파벳 배열(alphabet)의 길이만큼 for문을 돌린다.
 *    -> 최대 값이 alphabet[i]보다 작을 때, 최대 값은 alphabet[i]이다. i에 'A'를 더해주고 char 타입으로 형변환한다.
 *    -> 최대값이 alphabet[i]과 같을 때(가장 많이 사용된 알파벳이 여러 개일 경우), '?'를 return 한다.
 */
public class Exam1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();
        int[] alphabet = new int[26];

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'A';
            alphabet[idx]++;
        }

        int max = 0;
        char result = '?';
        for(int i=0; i<alphabet.length; i++){
             if(max < alphabet[i]){
                 max = alphabet[i];
                 result = (char) (i + 'A');
             }else if(max == alphabet[i]){
                result = '?';
             }
        }

        System.out.println(result);
    }
}
