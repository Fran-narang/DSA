package problems_on_array.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithIntK {

    public static int longestsubArrayBrute(int[] arr, int k){
        int length=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    length=Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }

    public static int longestSubArrayOptimal(int[] arr, int k){
        int sum = 0;
        int length=0;
        int left=0, right=0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k) {
                length = Math.max(length, right-left+1);
            }
            right++;
        }
        return length;
    }

    public static int longestSubArrayForNonPositive(int[] arr, int k){
        int sum=0;
        int length=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            if(sum==k){
                length=right+1;
            }
            else if(map.containsKey(sum-k)){
                length=Math.max(length,right-map.get(sum-k));
            }
            else if(!map.containsKey(sum)){
                map.put(sum, right);
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] arr={7,15,2,1,-8,1,1,-1,-1,10};
        //System.out.println(longestsubArrayBrute(arr, 12));
        //System.out.println(longestSubArrayOptimal(arr, 12));
        System.out.println(longestSubArrayForNonPositive(arr, 12));
    }
}
