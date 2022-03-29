package step4;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.HashSet;
    import java.util.Set;

    /**
     ** 2022-03-29 **
     *
     * - 백준 3052번 : 나머지
     *
     * - 이해하기
     * : 첫번 째 ~ 열번 째 줄까지 총 10개의 숫자를 입력받고 각 입력받은 숫자를 42로 나누었을 때 나머지를 구한다.
     *   나머지들을 비교하였을 때 서로 다른 값이 몇개 있는지를 출력한다.
     *   => 즉, 중복된 나머지 값을 제외한 나머지들의 숫자를 알면된다.
     *
     * - 해결방법
     * 1) Set 객체(set)를 생성한다.(Set은 중복없이 값을 담을 수 있다.)
     * 1) for문을 통해 10개의 숫자를 입력받는다.(input)
     * 2) 각 숫자를 입력받을 때마다 42로 나누어준다.
     * 3) 나머지(remain)을 Set 객체(set)에 저장한다.
     * 4) Set 객체의 사이즈를 출력한다.
     */
    public class Exam3052 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Set<Integer> set = new HashSet<>();

            for(int i=0; i<10; i++){
                int input = Integer.parseInt(br.readLine());
                int remain = input % 42;

                set.add(remain);
            }

            br.close();

            System.out.println(set.size());

        }
    }
