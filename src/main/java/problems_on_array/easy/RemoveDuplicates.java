package problems_on_array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void removeUsingBrute(int[] nums){ //time O(nlogn)+O(n)   && space O(n)
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length-1;i++){
            set.add(nums[i]);
        }
        int index=0;
        for(int num : set){
            nums[index] = num;
            index++;
        }
        System.out.println("no of elemts in array "+index);
        System.out.println(set);
    }

    public static int removeWithoutBrute(int[] nums){
        if (nums.length == 0) return 0;
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[index]){
                index++;
                nums[index] = nums[i];

            }
        }
        System.out.println(index+1);
        System.out.println(Arrays.toString(nums));
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,5,5,6,6};
        //removeUsingBrute(nums);
        removeWithoutBrute(nums);


    }
}
