package Midium;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  x = sc.next();
        System.out.println(myAtoi(x));

    }
    public static int myAtoi(String s) {
        boolean flag = false;
        int start = 0;
        int end = s.length();
        while (start<end && (s.charAt(start)=='_'||s.charAt(start)==' ')){
            start++;
        }
        if(s.charAt(start)=='-'){
            flag=true;
            start++;
        }
        else if (s.charAt(start)=='+'){
            start++;
        }
        long output = 0;
        while(start<end && Character.isDigit(s.charAt(start))){
            output = output*10 + Character.getNumericValue(s.charAt(start));

            if(flag && output*(-1)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            else if(!flag && output>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            start++;

        }
        if (output<0){
            output = output*-1;
        }
        return (int)output;


    }
}
