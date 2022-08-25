package Midium;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        System.out.println(reverse(x));

    }
    public static int reverse(int x){
        boolean flag = false;
        long reversed = 0;
        if (x<0){
            flag = true;
            x = x*-1;
        }
        while (x>0){
            reversed = x%10 + reversed*10;
            x/=10;
            if(reversed>Integer.MAX_VALUE){
                reversed = 0;
            }
        }

        if(flag){
            reversed = reversed*-1;
        }
        return (int) reversed;
    }

}
