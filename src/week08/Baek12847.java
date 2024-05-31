package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek12847 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long[] arr = new long[N+2];
        long[] prefixsum = new long[N];
        long max = Integer.MIN_VALUE;

        for(int i = 2; i < N+2; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 2; i < N+2; i++) {
            prefixsum[i - 2] = arr[i] + arr[i - 1] + arr[i - 2];
        }


        for (int i = 0; i < N; i++) {
            if(max < prefixsum[i]){
                max = prefixsum[i];
            }
        }

        System.out.println(max);
    }
}
