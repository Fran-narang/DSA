package Self_Prac;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    public static int longestSubArray(int[] arr, int num){

        int subArray=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==num){
                   subArray=Math.max(subArray, j-i+1);
                }
            }
        }
        return subArray;
    }

    public static int subArrayOptimal(int[] arr, int num){
        int subArray=0;
        int sum=0;
        int left=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while (sum>num){
                sum-=arr[left];
                left++;
            }
            if(sum==num){
                subArray = Math.max(subArray, i-left+1);
            }
        }
        return subArray;
    }

    public static int subArrayForNonPositive(int[] arr, int num){

        Map<Integer, Integer> map = new HashMap<>();

        int subArray=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==num){
                subArray=i+1;
            }
            else if (map.containsKey(sum-num)) {
                subArray = Math.max(subArray, i-map.get(sum-num));
            }
            else if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return subArray;
    }

    public static void main(String[] args) {

        int[] arr = {7,2,5,1,1,1,1,1,1,1,1,1,1,4};
        System.out.println(longestSubArray(arr, 14));
        System.out.println(subArrayOptimal(arr, 14));

        int[] nonPositiveArray = {2,5,-7,-3,1,2,3,3};
        System.out.println(subArrayForNonPositive(nonPositiveArray, 3));
    }
}
