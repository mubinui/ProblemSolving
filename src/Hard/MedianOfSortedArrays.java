package Hard;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int a [] = {1,2};
        int b [] = {3,4};
        MedianOfSortedArrays m = new MedianOfSortedArrays();
        double out = m.findMedianSortedArrays(a,b);
        System.out.println(out);


    }
    public double findMedianSortedArrays(int [] num1, int [] num2){
        int i = 0, j= 0,k=0;
        int [] merged = new int[num1.length+num2.length];
        while (i<num1.length && j<num2.length){
            if(num1[i]>num2[j]){
                merged[k] = num2[j];
                j++;
            }
            else{
                merged[k] = num1[i];
                i++;
            }
            k++;
        }
        while (i<num1.length){
            merged[k]=num1[i];
            i++; k++;
        }
        while (j<num2.length){
            merged[k]=num2[j];
            j++; k++;
        }
        for(int f:merged){
            System.out.print(f+" ");
        }
        System.out.println();
        System.out.println(merged.length);
        double output;
        if(merged.length%2==0){
            output =( (double) merged[(merged.length/2)-1]+ (double) merged[merged.length/2])/2;

        }
        else{
            output = merged[merged.length/2];

        }



       return output;
    }
}
