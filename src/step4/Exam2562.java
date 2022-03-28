package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9]; // 배열 생성

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine()); // 배열 정수 담기
        }
        br.close(); // BufferedReader 종료

        int max = arr[0]; // 최대 값 : arr[0]으로 초기화
        int idx = 1; // 최대 값의 위치 : arr[0]이 제일 클 경우 위치는 첫 번째(1)

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){ // arr[i]가 max 값보다 크면
                max = arr[i]; // max를 arr[i]로 바꾸기
                idx = i + 1; // 위치는 인덱스의 + 1
            }
        }

        sb.append(max).append("\n").append(idx);
        System.out.println(sb);
    }
}
