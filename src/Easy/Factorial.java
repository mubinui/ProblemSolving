package Easy;

public class Factorial {
    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x);

    }
    public static int factorial(int x ){

        if (x==1 ||x ==0){
            return 1;
        }
        else {
            return x*factorial(x-1);
        }

    }
}
