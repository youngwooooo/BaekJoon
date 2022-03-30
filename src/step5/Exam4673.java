package step5;

/**
 ** 2022-03-30 **
 *
 * - 백준 4673번 : 셀프 넘버
 *
 * - 이해하기
 * : d(n) = 양의 정수 n에 대해서 n과 n의 각 자리수를 더하는 함수
 *  이 때, n은 d(n)의 생성자이고 셀프 넘버는 생성자가 없는 숫자를 말한다.
 *  -> ex) d(75) = 75 + 7 + 5 = 87
 *         75는 87의 생성자
 *  즉, 일단 1 ~ 10000까지의 d(n)을 구하고 1 ~ 10000까지에서 구한 d(n)이 아닌 값들은 모두 셀프 넘버다.
 *
 * - 해결방법
 * 1) d(n)을 구하기 위한 함수(d())를 생성
 *   -> d(n)은 n과 각 n자리 수의 합이므로 모든 수를 합할 sum 변수를 생성하고 값은 n으로 초기화한다.
 *   -> while문을 통해 n이 0보다 클동안 n을 10으로 나눈 나머지를 sum에 더하고 n을 10으로 나누어준다.
 *      ex) n = 1234, d(1234) = 1234 + 4( 1234%10 ) + 3( 123% 10 ) + 2 ( 12 % 10 ) + 1 ( 1 % 10 ) => 1244
 *   -> 모든 수를 합한 sum이 d(n)이므로 return
 *
 * 2) 길이가 10001인 boolean 배열(check) 생성
 *    -> n은 1 ~ 10000까지이므로 인덱스와 n을 맞추기 위함
 *
 * 3) for문을 통해 d(n)(dn)을 구하고 d(n)이 10000 보다 작거나 같을 때 까지 check[dn]의 값을 true로 바꾼다.
 * 4) for문을 통해 check 배열의 값이 false일 때의 인덱스(셀프 넘버)를 StringBuilder 객체(sb)에 저장한다.
 * 5) 결과 출력
 *
 */
public class Exam4673 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[100001];

        for(int i=1; i<=10000; i++){
            int dn = d(i);
            if(dn <= 10000){
                check[dn] = true;
            }
        }

        for(int i=1; i<=10000; i++){
            if(!check[i]){
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }

    public static int d(int n){
        int sum = n;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
