package problems_on_array.medium;

import java.util.HashMap;
import java.util.Map;

public class Kadanes {

    public static int maxSubArraySum(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                max= Math.max(max, sum);
            }
        }
        return max;
    }

    public static int maxSubArraySumBetter(int[] arr){
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            sum+=num;
//            max = Math.max(max, sum);
//            if(sum<0){
//                sum=0;
//                max = Math.max(max, num);
//            }

            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr ={-2,-5,-1,-7,-9};
        System.out.println(maxSubArraySum(arr));
        System.out.println(maxSubArraySumBetter(arr));
    }
}
