package problems_on_array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static String twoSumStringBrute(int[] arr, int target){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    sum=arr[i]+arr[j];
                    if(sum==target){
                        return "YES";
                    }
                }

            }
        }
        return "NO";
    }
    public static int[] twoSumArrayBrute(int[] arr, int target){
        int sum = 0;
        int[] index = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    sum=arr[i]+arr[j];
                    if(sum==target){
                        index[0]=i;
                        index[1]=j;

                        return index;
                    }
                }

            }
        }
        return new int[]{-1,-1};

    }


    public static String twoSumStringOptimal(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                return "YES";
            }
            map.put(arr[i], i);
        }
        return "NO";
    }

    public static int[] twoSumArrayOptimal(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        int[] index = new int[2];

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                index[0] = i;
                index[1] = map.get(target-arr[i]);
                return index;
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }

    public static String twoSumUsingPointer(int[] arr, int target){
        int[] array = Arrays.stream(arr).sorted().toArray();
        int left=0;
        int right = array.length-1;
        while (left<right){
            int sum = array[left] + array[right];
            if(sum == target) return "YES";
            else if(sum > target) right--;
            else left++;
        }
        return "NO";
    }


    public static void main(String[] args) {
        int[] arr = {2,7,8,9,12,3};
        System.out.println(twoSumStringBrute(arr, 17));
        System.out.println(Arrays.toString(twoSumArrayBrute(arr, 17)));
        System.out.println(twoSumStringOptimal(arr, 17));
        System.out.println(twoSumArrayOptimal(arr, 17));
        System.out.println(twoSumUsingPointer(arr, 17));
    }
}
