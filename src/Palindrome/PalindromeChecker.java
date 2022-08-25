package Palindrome;



public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "";
        //System.out.println(palindrome(s));
        System.out.println(longestPalindrome("abb"));



    }
    public static boolean palindrome(String s){
        char [] chars = s.toCharArray();
        String output = "";
        int j = chars.length-1;
        int counter =0;

        for (int i = 0; i < chars.length ; i++) {
            if(chars[i]==chars[j]){
                counter++;
                output+= String.valueOf(chars[i]);
                System.out.println(output);
                j--;
            }
            else {
                break;
            }
        }
        System.out.println(output);


        return counter==chars.length;

    }


    public static String longestPalindrome(String s ){
        String output = "";
        String temp = "";
        int max = 0;
        char [] chars = s.toCharArray();
        for (int k = 0; k <chars.length; k++) {
            int j = chars.length-1;
            temp = "";
            for (int i = k; i <chars.length; i++) {
                if(chars[i]==chars[j]){
                    temp+=String.valueOf(chars[i]);
                    j--;

                } else if (temp.length()>max) {
                    output = temp;
                    max=temp.length();
                    temp = "";


                }


            }

        }

        if(temp.length()>max){
            output = temp;
        }

        return output;
    }
}
