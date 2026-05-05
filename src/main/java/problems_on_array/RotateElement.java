package problems_on_array;

import java.util.Arrays;

public class RotateElement {

    public static void rotateLeftByOne(int[] nums){
        int temp = nums[0];
        int index=0;

        for(int i=0;i<nums.length-1;i++){
            nums[index] = nums[i+1];
            index++;
        }
        nums[index] = temp;
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateLeftByKBrute(int[] nums, int k){
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = nums[i];
        }
        for(int i=k;i<nums.length;i++){
            nums[i-k] = nums[i];
        }
        for(int i=nums.length-k;i<nums.length;i++){
            nums[i]=temp[i-(nums.length-k)];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArr(int[] nums, int start, int end){
        while (start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateLeftByK(int[] nums, int k){
        rotateArr(nums,0,k-1);
        rotateArr(nums, k, nums.length-1);
        rotateArr(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateRightByK(int[] arr, int k){

        k=arr.length-k;
        rotateArrRight(arr, 0, k-1);
        rotateArrRight(arr, k, arr.length-1);
        rotateArrRight(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArrRight(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]  =temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,1,2,3};
        //rotateLeftByOne(nums);
       // rotateLeftByKBrute(nums, 2);
       // rotateLeftByK(nums, 3);
        rotateRightByK(nums, 4);
    }
}
