package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int [] a = new int[10];
        Arrays.fill(a,-1);
        int x = 6;
        System.out.println(fibonacci_dynamic(a,x));


    }
    public int fibonacci(int x){
        if(x==0){
            return 0;
        }
        else if (x==1){
            return 1;
        }
        int first = fibonacci(x-1);
        int second = fibonacci(x-2);
        return first+second;


    }
    public static int fibonacci_dynamic(int [] a, int x){
        int first =0 , second=0 ;
        if(x==0){
            return 0;
        } if (x==1) {
            return 1;

        }
        if(a[x-1]==-1){
            a[x-1] = fibonacci_dynamic(a,x-1);
            first = a[x-1];
        }
        if(a[x-1]!=-1){
            first = a[x-1];
        }
        if(a[x-2]==-1){
            a[x-2] = fibonacci_dynamic(a,x-2);
            second = a[x-2];
        }
        if(a[x-2]!=-1){
            second = a[x-2];

        }
        return first+second;

    }
}
