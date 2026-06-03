package problems_on_array.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionTwoSortedArray {

    public static List<Integer> intersectionOfArray(int[] arr1, int[] arr2){
        int i =0;
        int j=0;

        Set<Integer> intersection = new HashSet<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        while(i<arr1.length){
            intersection.add(arr1[i]);
            i++;
        }

        while(j<arr2.length){
            intersection.add(arr2[j]);
            j++;
        }
        return intersection.stream().toList();
    }

    public static void main(String[] args) {

        int[] arr1 = {5,5,6,6,8,9,12,15};
        int[] arr2 = {5,5,6,8,8,8,9,12,18,19};
        System.out.println(intersectionOfArray(arr1, arr2));
    }
}
