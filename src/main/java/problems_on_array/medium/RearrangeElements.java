package problems_on_array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElements {

    public static int[] rearrangeBrute(int[] arr){
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        if(arr.length%2!=0){
            return new int[]{-1};
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive.add(arr[i]);
            }
            else {
                negative.add(arr[i]);
            }
        }

        for(int i=0;i<arr.length/2;i++){
            arr[2*i] = positive.get(i);
            arr[2*i+1] = negative.get(i);
        }
        return arr;
    }

    public static int[] rearrangeOptimal(int[] arr){
        int[] ans = new int[arr.length];

        int pos = 0;
        int neg = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else {
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,7,-1};
        System.out.println(Arrays.toString(rearrangeBrute(arr)));
        System.out.println(Arrays.toString(rearrangeOptimal(arr)));
    }
}
