package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = num;
        int cnt = 0;

        while(true){
            int first = (num % 10) * 10;
            int end = ((num / 10) + (num % 10)) % 10;

            num = first + end;
            cnt++;

            if(num == result){
                break;
            }
        }

        System.out.println(cnt);
    }
}
