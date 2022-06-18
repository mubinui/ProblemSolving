package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int a [] = new int[x*2];
        Arrays.fill(a,-1);
        int z= fibonacci_op(x,a);
        System.out.println(z);
        int y= fibonacci_wm(x);
        System.out.println(y);


    }

    public static int fibonacci_wm(int x){
        if (x==1||x==0){
            return x;
        }
        else {
            return fibonacci_wm(x-1)+fibonacci_wm(x-2);
        }
    }

    public static int fibonacci_op(int x,int [] a){
        if(x==1 || x==0){
            return x;
        }
        else{
            int first, second;
            if (a[x-1]!=-1){
                first = a[x-1];
            }
            else {
                first = fibonacci_op(x-1,a);
            }
            if (a[x-2]!=-1){
                second = a[x-2];
            }
            else{
                second = fibonacci_op(x-2,a);

            }
            return a[x] = first + second;
        }
    }
}
