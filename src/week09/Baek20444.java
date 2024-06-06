package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek20444 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long N = Long.parseLong(stringTokenizer.nextToken());
        long K = Long.parseLong(stringTokenizer.nextToken());

        long left = 0;
        long right = N/2;

        while(left <= right){
            long mid = (left + right) / 2;
            long value = (mid +1) * ((N-mid) + 1);

            if(value > K){
                right = mid - 1;
            }else if(value < K){
                left = mid + 1;
            }else{
                System.out.print("YES");
                return;
            }
        }

        System.out.print("NO");
    }
}
