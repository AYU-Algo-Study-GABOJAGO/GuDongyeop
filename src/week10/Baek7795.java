package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int testCase = Integer.parseInt(bufferedReader.readLine());

        while(testCase --> 0){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            int[] Aarr = new int[A];
            int[] Barr = new int[B];

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for (int i = 0; i < A; i++) {
                Aarr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for (int i = 0; i < B; i++) {
                Barr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            Arrays.sort(Aarr);
            Arrays.sort(Barr);

            int Apoint = 0;
            int Bpoint = 0;
            int count = 0;

            while(Apoint != A && Bpoint != B){
                if(Aarr[Apoint] > Barr[Bpoint]){
                    count += A - Apoint;
                    Bpoint++;
                }else{
                    Apoint++;
                }
            }

            System.out.println(count);
        }
    }
}
