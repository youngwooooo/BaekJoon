package step2;

import java.util.Scanner;

public class Exam2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int step = sc.nextInt();
        int sum = m + step;

        if(sum > 59){
            h += sum / 60;
            m = sum % 60;

            if(h > 23){
                h = h - 24;
            }

            System.out.println(h + " " + m);
        }else {
            System.out.println(h + " " + (m + step));
        }
    }
}
