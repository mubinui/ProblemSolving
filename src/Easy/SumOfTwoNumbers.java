package Easy;

import java.util.Hashtable;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

    }
    public static int [] twoSum(int [] a, int targetSum ){
        boolean flag = false;
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        for (int i = 0; i <a.length ; i++) {
            hashtable.put(i,a[i]);
        }
        int output [] = new int[2];
        for (int i = 0; i <a.length ; i++) {
            if(hashtable.contains(targetSum-(a[i])) && hashtable.get(i)!=(targetSum-a[i])){
                flag = true;
                output[0] = targetSum-a[i];
                output[1] = a[i];

            }

        }
        if(flag) return output;
        else return new int[0];
    }
}
