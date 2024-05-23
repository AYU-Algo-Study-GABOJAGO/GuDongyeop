package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] mario = new int[10];
        int sum = 0;

        for(int i=0; i<10; i++){
            mario[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            sum += mario[i];

            if(sum > 100) {
                if (100 - (sum - mario[i]) < sum - 100) {
                    sum -= mario[i];
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
