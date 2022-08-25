package Easy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x){
        boolean flag = false;
        int counter = 0;
        if(x>0){
            char [] chars = (x+"" ).toCharArray();
            System.out.println(chars.length);
            if (chars.length==1) flag=true ;
            else if(chars.length%2==0 ){
                int j = chars.length-1;
                for (int i = 0; i <chars.length/2; i++) {
                    if (chars[i]==chars[j]){
                        counter++;

                    }
                    j--;
                }
                if (chars.length/2==counter){
                    flag = true;
                }
            }
            else{
                int temp = chars.length/2+1;
                int j = chars.length-1;
                for (int i = 0; i <chars.length/2+1; i++) {
                    if (chars[i]==chars[j]){
                        counter++;

                    }
                    j--;

                }
                if (temp==counter){
                    flag = true;
                }
            }


        }
        return flag;
    }
}
