package Harman;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigDecimal;


public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        long n = Long.parseLong(br.readLine().trim());

        long out_ = FindBigNum(n);
        wr.println(out_);
        wr.close();
        br.close();
    }

    static long FindBigNum(long n) {
        // Write your code here
        String result = "";
        //Map<Long,String> map = new HashMap<>();
        for(long i=1;i<=n;i++){
            String decimalValue = getDecimalValue(i);
            System.out.println(i+" : "+decimalValue);
            result += decimalValue;
        }
        System.out.println(result);
        return convertToDecimal(result) % 1000000007;
        //return convertToDecimal(result);

    }

    static long convertToDecimal(String n) 
    { 
        String num = n; 
        long dec_value = 0; 
  
        // Initializing base value to 1, 
        // i.e 2^0 
        long base = 1; 
  
        long len = num.length(); 
        for (long i = len - 1; i >= 0; i--) { 
            if (num.charAt((int) i) == '1') 
                dec_value += base; 
            base = base * 2; 
        } 
        System.out.println(dec_value);
        return dec_value; 
    }

    static String getDecimalValue(long n){
        String result = "";
        while(n>0){
            result += n%2;
            n = n/2;
        }
        return new StringBuilder(result).reverse().toString();
    }
}