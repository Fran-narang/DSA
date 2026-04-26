package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public void bubbleusingRecursion(int[] arr, int head, int tail){
        if(tail==0){
            return;
        }
        if (head >= tail) {
            bubbleusingRecursion(arr, 0, tail-1);
            return;
        }
        if(arr[head]>arr[head+1]){
            int temp = arr[head];
            arr[head] = arr[head+1];
            arr[head+1] = temp;
        }
        bubbleusingRecursion(arr, head+1, tail);
    }

    public static void main(String[] args) {

        RecursiveBubbleSort obj = new RecursiveBubbleSort();
        int[] arr = new int[]{5,8,1,78,14,2,9};
        obj.bubbleusingRecursion(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
