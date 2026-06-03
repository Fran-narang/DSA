package problems_on_array.easy;

public class CheckSortedArray {

    public static boolean sortChecker(int[] nums){
        if(nums.length<2) return true;
        for(int i = 1; i< nums.length-1; i++){
            if(nums[i]>= nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,9,11,18,20};
        int[] arr1 = {3,4,5,1,2};
        System.out.println(sortChecker(arr1));
    }
}
