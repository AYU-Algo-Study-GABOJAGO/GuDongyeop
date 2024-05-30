package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int H = Integer.parseInt(stringTokenizer.nextToken());

        int[] odd = new int[H+1]; //석순
        int[] even = new int[H+1]; //종유석
        int result = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < N+1; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());

            if(i % 2 != 0){
                odd[a]++;
            }else{
                even[a]++;
            }
        }

        for (int i = 1; i < H+1; i++) {
            odd[i] += odd[i-1];
            even[i] += even[i-1];
        }

        int[] arr = new int[H+1];

        for (int i = 1; i < H+1; i++) {
            arr[i] += odd[H] - odd[i-1];
            arr[i] += even[H] - even[H-i];
            min = Math.min(arr[i],min);
        }

        for (int i = 1; i < H+1; i++) {
            if(arr[i] == min){
                result++;
            }
        }

        System.out.println(min + " " + result);
    }
}
