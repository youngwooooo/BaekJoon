package step3;

import java.util.Scanner;

public class Exam10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < x){
                sb.append(arr[i] + " ");
            }
        }

        System.out.println(sb);
    }
}
