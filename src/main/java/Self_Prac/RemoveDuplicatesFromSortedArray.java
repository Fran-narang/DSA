package Self_Prac;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int[] removeDuplicateFromArray(int[] arr){
        int count=1;
        if(arr.length<2){
            return arr;
        }
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[count]=arr[i+1];
                count++;
            }
        }
        return Arrays.copyOf(arr, count);
    }

    public static void main(String[] args) {
        int[] arr ={2,5,5,5,6,7,7,8,9,10,10};
        System.out.println(Arrays.toString(removeDuplicateFromArray(arr)));
    }
}
