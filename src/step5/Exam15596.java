package step5;

/**
 ** 2022-03-29 **
 *
 * - 백준 15596번 : 정수 N개의 합
 *
 * - 이해하기
 * : 기존에 main 함수를 통해 제출했던 문제와는 다른 형식이다.
 *   정수 n개가 주어졌을 때, 모든 정수 n의 합을 구하는 문제이다
 *   즉, 정수 배열에 n개 만큼의 정수가 있으므로 해당 배열의 모든 값을 더한다.
 *
 * - 해결방법
 * 1) 인자로 받은 정수 배열(a)를 a의 길이만큼 반복한다.
 * 2) 배열의 모든 값을 더한다.(ans)
 * 3) 합계(ans)를 return한다.
 */
public class Exam15596 {
    long sum(int[] a){
        long ans = 0;

        for(int i=0; i<a.length; i++){
            ans += a[i];
        }

        return ans;
    }
}
