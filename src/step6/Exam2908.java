package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 ** 2022-03-31 **
 *
 * - 백준 2908번 : 상수
 *
 * - 이해하기
 * : 입력받은 두 수를 거꾸로 읽어 더 큰 값을 출력
 *
 * - 해결방법
 * 1) 입력받은 수의 길이만큼 for문을 거꾸로 돌린다
 *    -> charAt()을 활용해 한 글자식 가져오고 String으로 형변환하여 reverseA, reverseB에 저장한다.
 * 2) int로 형변환한 reverseA, reverseB를 Math.max()로 비교하여 최대 값을 구한다.
 * 3) 결과 출력
 */
public class Exam2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        String reverseA = "";
        String reverseB = "";

        for(int i=a.length() - 1; i>=0; i--){
            char charA = a.charAt(i);
            char charB = b.charAt(i);

            reverseA += String.valueOf(charA);
            reverseB += String.valueOf(charB);
        }

        int max = Math.max(Integer.parseInt(reverseA), Integer.parseInt(reverseB));

        System.out.println(max);

    }
}
