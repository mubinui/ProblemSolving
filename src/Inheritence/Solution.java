package Inheritence;

public class Solution extends VersionControl{
    public int firstBadVersion(int n){
        int flag = 0;
        for (int i = 0; i <n ; i++) {
            if (isBadVersion(n)){
                flag = n;

            }

        }
        return flag;

    }
}
