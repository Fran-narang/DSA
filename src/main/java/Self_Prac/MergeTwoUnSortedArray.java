package Self_Prac;

import java.util.*;

public class MergeTwoUnSortedArray {

    //map and set is used mostly for unsorted array
    public static List<Integer> unionOfTwoUnSortedArray(int[] arr1, int[] arr2 ){

        List<Integer> newList = new ArrayList<>();

        Map<Integer, Boolean> intersection = new HashMap<>();
        for(int num:arr1){
            intersection.put(num,true);
        }
        for(int num:arr2){
            intersection.put(num, true);
        }

        for(Map.Entry<Integer, Boolean> entry:intersection.entrySet()){
            newList.add(entry.getKey());
        }

        return newList;
    }

    public static Set<Integer> unionOfTwoUnSortedArrayUsingSet(int[] arr1, int[] arr2 ){
        Set<Integer> set = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr1 = {29,71,80,12,14};
        int[] arr2 = {70,8,12,1,16,20,22};

        //System.out.println(unionOfTwoUnSortedArray(arr1, arr2));
        System.out.println(unionOfTwoUnSortedArrayUsingSet(arr1, arr2));
    }
}
