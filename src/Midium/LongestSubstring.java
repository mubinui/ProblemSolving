package Midium;

import java.util.TreeSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "dvdf";
        LongestSubstring st = new LongestSubstring();
        int max = st.lengthOfLongestSubstring(s);
        System.out.println(max);



    }
    public int lengthOfLongestSubstring(String s){
        int max = 0, temp = 0,k=0;
        char [] cr = s.toCharArray();
        if(s.length()>0){
            TreeSet<Character> set=new TreeSet<>();
            for (int i = 0; i <cr.length ; i++) {
                if(set.size()==temp){
                    set.add(cr[i]);
                    temp++;
                }
                else {
                    temp = 0;
                    set.clear();
                    i--;
                }
                if(temp>max){
                    max = temp;
                }

            }

        }
        return max;
    }

}
