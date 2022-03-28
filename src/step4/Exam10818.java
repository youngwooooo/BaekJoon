package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 개수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 정수
        int[] arr = new int[n]; // 배열
        int idx = 0; // 배열 인덱스

        while (st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        Arrays.sort(arr); // 오름차순 정렬

        int min = arr[0]; // 최소값
        int max = arr[n-1]; // 최대값

        System.out.print(min + " " + max);

    }
}
