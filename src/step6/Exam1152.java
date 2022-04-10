package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 ** 2022-03-31 **
 *
 * - 백준 1152번 : 단어의 개수
 *
 * - 이해하기
 * : 영어 대,소문자와 공백으로 이루어진 문자열
 *   단어는 공백으로 구분됨
 *   문자열은 공백으로 시작하거나 끝날 수 있음
 *   즉, 공백으로 나누어 문자의 개수를 출력
 *
 * - 해결방법
 * 1) 입력받은 문자열을 split()을 활용해 공백으로 나눈 문자열 배열(arr)을 만든다.
 * 2) 문자열 배열의 길이가 0보다 클 때
 *    -> 배열의 첫번째 값이 공백일 경우 = 단어의 개수 : arr.length - 1
 *    -> 배열의 첫번째 값이 공백이 아닐 경우 = 단어의 개수 : arr.length
 *    문자열 배열의 크기가 0보다 같거나 작을 때
 *    -> 단어의 개수 : 0
 */
public class Exam1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        if(arr.length > 0){
            if(arr[0].equals("")){
                System.out.println(arr.length - 1);
            }else {
                System.out.println(arr.length);
            }
        }else {
            System.out.println(0);
        }
    }
}
