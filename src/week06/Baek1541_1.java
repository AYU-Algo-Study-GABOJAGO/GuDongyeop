package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1541_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(),"-");
        //stringToknizer
        // 1번토큰에 55
        // 2번토큰에 50+40
        int result = Integer.MAX_VALUE;


        while(stringTokenizer.hasMoreTokens()){
            String str = stringTokenizer.nextToken(); // 55
            int temp = 0;

            StringTokenizer add = new StringTokenizer(str,"+");

            while(add.hasMoreTokens()){
                temp += Integer.parseInt(add.nextToken());
            }

            if(result == Integer.MAX_VALUE){
                result = temp;
            }else{
                result -= temp;
            }

        }

        System.out.println(result);
    }
}
