package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {

    public void insertionRecursive(int[] arr, int head, int tail){

        if(head==tail){
            return;
        }
        int pointer = head;

        while (pointer>0 && arr[pointer-1]>arr[pointer]){
            int temp = arr[pointer-1];
            arr[pointer-1] = arr[pointer];
            arr[pointer] = temp;
            pointer--;
        }
        insertionRecursive(arr, head+1, tail);


    }

    public static void main(String[] args) {
        RecursiveInsertionSort obj = new RecursiveInsertionSort();
        int[] arr = new int[]{7,1,8,15,19,2,3};
        obj.insertionRecursive(arr, 1, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
