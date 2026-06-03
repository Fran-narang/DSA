package problems_on_array.easy;

import java.util.Arrays;

public class MoveZerosAtEnd {

    public static int[] moveZer(int[] arr){
        int index=0;
        int last=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[index]=arr[i];
                index++;
            }

        }
        int zeros=arr.length-index;

        for(int i=0;i<zeros;i++){
            arr[index] = 0;
            index++;
        }
        return arr;
    }

    public static int[] moveZero(int[] arr){
        int pointer = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[pointer]!=0){
                pointer++;
            }
            else if(arr[pointer]==0 && arr[i+1]!=0){
                int temp = arr[i+1];
                arr[i+1] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}
