package Self_Prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePosNeg {

    public static int[] rearrangeBrute(int[] arr){
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive.add(arr[i]);
            }
            else {
                negative.add(arr[i]);
            }
        }

        for(int i=0;i<arr.length/2;i++){
            arr[i*2]=positive.get(i);
            arr[i*2+1]=negative.get(i);
        }
        return arr;
    }

    public static int[] rearrangeOptimal(int[] arr){
        int[] newArr = new int[arr.length];
        int pos=0;
        int neg=1;
        for(int  i=0;i<arr.length;i++){
            if(arr[i]>0){
                newArr[pos]=arr[i];
                pos+=2;
            }
            else {
                newArr[neg]=arr[i];
                neg+=2;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,7,-1};
        System.out.println(Arrays.toString(rearrangeBrute(arr)));
        System.out.println(Arrays.toString(rearrangeOptimal(arr)));
    }
}
