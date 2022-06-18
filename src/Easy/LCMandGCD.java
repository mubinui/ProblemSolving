package Easy;

public class LCMandGCD {
    public static void main(String[] args) {
        int a = 12, b = 30;
        System.out.println(GCD(a,b)+" "+LCM(a,b));


    }
    public static int GCD(int a, int b){
        if (a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    public static int LCM(int a, int b){
        return (a/GCD(a,b)*b);
    }
}
