package problems_on_array.medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort012 {

    public static int[] sort(int[] arr){

        int left=0;
        int right=arr.length-1;
        int mid=0;
        while (mid<=right){
            if(arr[mid]==0){
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                left++;
                mid++;
            } else if (arr[mid]==2) {
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }
            else {
                mid++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
