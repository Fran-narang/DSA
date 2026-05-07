package problems_on_array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoSortedArray {

    public static List<Integer> intersectionOfArray(int[] arr1, int[] arr2){
        int i =0;
        int j=0;

        List<Integer> intersection = new ArrayList<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            } else if (arr1[i]>arr2[i]) {
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {

        int[] arr1 = {5,5,6,6,8,9,12,15};
        int[] arr2 = {5,5,6,8,8,8,9,12,18,19};
        System.out.println(intersectionOfArray(arr1, arr2));
    }
}
