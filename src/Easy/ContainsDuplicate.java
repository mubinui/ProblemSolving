package Easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate( int [] nums ){
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            numbers.add(nums[i]);
            if(i+1!=numbers.size()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }
}
