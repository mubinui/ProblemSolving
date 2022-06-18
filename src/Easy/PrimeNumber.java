package Easy;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = checker(x);
        System.out.println(y==1);

    }

    public static int checker(int n){
        int prime = 0;
        int counter = 0;


        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                counter++;
            }


        }
        if(counter==2){
            prime = 1;
        }
        return prime;

    }
}
