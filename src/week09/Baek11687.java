package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11687 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(bufferedReader.readLine());

        int left = 1;
        int right = M*5;
        int result = 0;

        while(left <= right){
            int mid = (left+right) / 2;
            int count = 0;
            for (int i = 5; i <= mid; i*=5) {
                count += mid/i;
            }
            if(count > M){
                right = mid - 1;
            }else if(count == M){
                right = mid -1;
                result = 1;
            }else{
                left = mid+1;
            }
        }

        if(result == 0){
            System.out.println(-1);
        }else{
            System.out.println(left);
        }

    }
}
