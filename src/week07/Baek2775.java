package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2775 {
    static int[][] dp = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bufferedReader.readLine());

        int k,n;

        for(int i=0; i<15; i++){
            dp[0][i] = i;
        }


        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        for(int i=0; i<test; i++){
            k = Integer.parseInt(bufferedReader.readLine());
            n = Integer.parseInt(bufferedReader.readLine());
            System.out.println(dp[k][n]);
        }
    }

}
