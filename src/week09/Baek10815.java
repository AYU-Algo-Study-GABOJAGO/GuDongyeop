package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        Arrays.sort(arr);

        int M = Integer.parseInt(bufferedReader.readLine());
        int[] arr2 = new int[M];
        int[] result = new int[M];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(arr, arr2[i]) >= 0) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
