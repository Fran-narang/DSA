package sorting;

import java.util.Arrays;

public class RecursiveQuickSort {
    public void quickSort(int[] arr, int head, int tail){
        if(head<tail){
            int pivot = partitionFinder(arr, head, tail);
            quickSort(arr, head, pivot-1);
            quickSort(arr, pivot+1, tail);
        }
    }

    public int partitionFinder(int[] arr, int head, int tail){
        int left=head;
        int right= tail;
        int pivot = head;

        while (left<=right){
            while (arr[left]<=arr[pivot]&&left<=right) {
                left++;
            }
            while ((arr[right]>arr[pivot]&&right>left)){
                right--;
            }
            if(left<right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            int temp = arr[head];
            arr[head] = arr[right];
            arr[right] = temp;

        }
        return right;
    }

    public static void main(String[] args) {
        RecursiveQuickSort obj = new RecursiveQuickSort();
        int[] arr = new int[]{5,7,8,12,14,19,2,55};
        obj.quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
