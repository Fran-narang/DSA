package Self_Prac;

import java.util.Arrays;

public class RotateLeft {

    public static int[] rotateLeftArray(int[] arr, int k){
        int[] num = new int[k]; //[5,3,8,7,9,7]
        for(int i=0;i<k;i++){
            num[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        for(int i=arr.length-k;i<arr.length;i++){
            arr[arr.length-k]=num[i-(arr.length-k)];
        }
        return arr;
    }

    public static void rotate(int[] arr, int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static int[] rotateOptimal(int[] arr, int k){
        rotate(arr, 0,k-1);
        rotate(arr,k,arr.length-1);
        rotate(arr, 0, arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={5,3,8,7,9,7};
        //System.out.println(Arrays.toString(rotateLeftArray(arr,2)));
        System.out.println(Arrays.toString(rotateOptimal(arr, 2)));
    }
}
