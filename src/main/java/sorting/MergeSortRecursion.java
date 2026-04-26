package sorting;

import java.util.Arrays;

public class MergeSortRecursion {

    public void mergeSort(int[] arr, int head, int tail){
        if(head>=tail){
            return;
        }
        int mid = (head+tail)/2;
        mergeSort(arr, head, mid);
        mergeSort(arr, mid+1, tail);
        mergeAll(arr, head, mid, tail);
        System.out.println(Arrays.toString(arr));
    }
    public void mergeAll(int[] arr, int head, int mid, int tail){
        int[] temp = new int[arr.length];
        int left = head;
        int right = mid+1;
        int pointer = head;

        while(left<=mid && right<=tail){
            if(arr[left]<arr[right]){
                temp[pointer] = arr[left];
                left++;
                pointer++;
            }
            else {
                temp[pointer] = arr[right];
                pointer++;
                right++;
            }
        }

        while(left<=mid){
            temp[pointer] = arr[left];
            left++;
            pointer++;
        }
        while (right<=tail){
            temp[pointer] = arr[right];
            right++;
            pointer++;
        }

        for(int i=head;i<=tail;i++){
            arr[i] = temp[i];
        }
    }


    public static void main(String[] args) {
        MergeSortRecursion obj = new MergeSortRecursion();
        int[] arr = new int[]{5,1,8,78,4,95,2};
        obj.mergeSort(arr, 0, arr.length-1);

    }
}
