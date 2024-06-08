package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] one = new int[N];
        int[] two = new int[M];
        int[] result = new int[N+M];
        int one_point = 0;
        int two_point = 0;
        int a = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            one[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < M; i++) {
            two[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        while (one_point < N && two_point < M) {
            if (one[one_point] <= two[two_point]) {
                result[a++] = one[one_point++];
            } else {
                result[a++] = two[two_point++];
            }
        }

        //인덱스가 남아있는 경우도 고려
        while (one_point < N) {
            result[a++] = one[one_point++];
        }

        while (two_point < M) {
            result[a++] = two[two_point++];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(' ');
        }
        System.out.println(sb.toString().trim());

    }
}
