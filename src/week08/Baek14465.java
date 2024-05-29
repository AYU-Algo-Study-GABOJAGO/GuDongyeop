package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek14465 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); //신호등 개수
        int K = Integer.parseInt(stringTokenizer.nextToken()); //신호등 있어야될 개수
        int B = Integer.parseInt(stringTokenizer.nextToken()); //신호등 번호

        int[] arr = new int[N+1];


        for (int i = 0; i<B; i++){
            int a = Integer.parseInt(bufferedReader.readLine());
            arr[a] = 1;
        }

        int count = 0;

        for (int i = 1; i <= K; i++) {
            count += arr[i];
        }

        int min_count = count;

        for (int i = K+1; i <= N; i++) {
            count += arr[i] - arr[i-K];
            min_count = Math.min(min_count, count);
        }

        System.out.println(min_count);


    }
}
