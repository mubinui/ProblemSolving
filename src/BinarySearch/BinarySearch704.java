package BinarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,4,9,12};
        BinarySearch704 bs = new BinarySearch704();
        int x = bs.binary_search(nums,2);
        System.out.println(x);

    }

    public int  search(int [] nums, int target){
        if(nums.length>=2){
            int size = nums.length;
            int mid = nums.length/2;

            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target) {
                int L [] = new int[mid+1];
                for (int i = 0; i <mid ; i++) {
                    L[i] = nums[i];
                }
                return search(L,target);
            }
            else if (nums[mid]<target) {
                int R [] = new int[size-mid+1];
                for (int i = 0; i <R.length-1; i++) {
                    R[i] = nums[i+mid];
                }
                return search(R,target);
            }

        }
        return -1;

    }
    public int binary_search(int [] nums, int target){
        int idx = -1;
        int mid;
        int start = 0;
        int end = nums.length-1;
        while (end-start>=0){
            mid = (end+start)/2;
            if(nums[mid]==target){
                idx = mid;
                break;
            } else if (nums[mid]>target) {
                start = start;
                end = mid-1;

            }
            else {
                start = mid+1;
                end = end;

            }
        }

        return idx;
    }
}
