package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());

            if(N==0 && M==0){
                break;
            }

            int[] one = new int[N];
            int[] two = new int[M];
            int count = 0;

            for (int i = 0; i < N; i++) {
                one[i] = Integer.parseInt(bufferedReader.readLine());
            }

            for (int i = 0; i < M; i++) {
                two[i] = Integer.parseInt(bufferedReader.readLine());
            }

            int i = 0;
            int j = 0;

            while(i!=N && j!=M){
                if(one[i] == two[j]){
                    count++;
                    i++;
                    j++;
                }else if(one[i] > two[j]){
                    j++;
                }else{
                    i++;
                }
            }

            System.out.println(count);
        }

    }
}
