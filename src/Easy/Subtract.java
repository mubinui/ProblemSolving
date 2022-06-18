package Easy;

import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Testing sub_normal method

        int a [] = {1,9,5};
        for(int i:a){
            System.out.print(i+" ");
        }
        int digit = 5;
//        a = sub_normal(a,digit);
//        System.out.println();

//        for(int i:a){
//            System.out.print(i+" ");
//        }

//        System.out.println("------------------------------------");
        //Testing optimized the optimized
        System.out.println();

        a = sub_optimized(a,digit);
        for(int i: a){
            System.out.print(i+" ");
        }


    }

    public static int [] sub_normal(int [] a, int sub){
        int answer;
        double sum = 0;
        //convert the array to a number
        int j = a.length-1;
        for (int i = 0; i <a.length ; i++) {
            sum = Math.pow(10,j) * a[i] + sum;
            j--;

        }
//        System.out.println("Sum ->"+sum);
        answer = (int)sum-sub;
//        System.out.println("Answer->"+answer);
        int temp = 0;
        for (int i = a.length-1; i>=0; i--) {
            temp = answer%10;
            a[i]=temp;
            answer/=10;

        }
        return a;
    }


    public static int [] sub_optimized(int a[],int dec){
        int temp = 0;
        for (int i = a.length-1; i>=0 ; i--) {
            if((a[i]+(dec+temp))<10){
                a[i]=a[i]+(dec+temp);
                temp = 0;
                dec = 0;
            }
            else{
                a[i]= (a[i]+dec+temp)%10;
                temp = 1;
                dec = 0;

            }

        }

        return a;

    }


}
