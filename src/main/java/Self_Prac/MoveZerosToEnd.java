package Self_Prac;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZerosToEnd {

    public static int[] moveZerosAtEnd(int[] arr){

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,5,0,0,12,7,8,0};
        System.out.println(Arrays.toString(moveZerosAtEnd(arr)));
    }
}
