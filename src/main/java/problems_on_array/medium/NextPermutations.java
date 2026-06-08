package problems_on_array.medium;

import java.util.Arrays;

public class NextPermutations {

    public static int[] reverse(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        return arr;
    }

    public static int[] nextPermutation(int[] arr){

        int pivot = -1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr,0,arr.length-1);
            return arr;
        }

        for(int i=arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i]=arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        reverse(arr, pivot+1, arr.length-1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }
}
