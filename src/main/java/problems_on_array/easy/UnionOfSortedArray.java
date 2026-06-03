package problems_on_array.easy;

import java.util.*;

public class UnionOfSortedArray {

    public static int[] unionOfArrays(int[] num1, int[] num2){
        Set<Integer> union = new HashSet<>();
        for(int a:num1){
            union.add(a);
        }
        for(int a:num2){
            union.add(a);
        }
       int[] arr = new int[union.size()];
        int index=0;
        for(int num:union){
            arr[index++] = num;
        }
        return arr;
    }

    public static List<Integer> unionUsingPointer(int[] arr1, int[] arr2){
            int n = arr1.length;
            int m = arr2.length;
            int i = 0, j = 0;
            List<Integer> union = new ArrayList<>();

            while (i < n && j < m) {
                if (arr1[i] <= arr2[j]) {
                    if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                        union.add(arr1[i]);
                    }
                    i++;
                } else {
                    if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                        union.add(arr2[j]);
                    }
                    j++;
                }
            }

            while (i < n) {
                if (union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }

            while (j < m) {
                if (union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }

            return union;
        }

    public static void main(String[] args) {
        int[] arr1 ={8,9,17,18,21,25};
        int[] arr2 = {1,8,9,11,12,15};
        //System.out.println(Arrays.toString(unionOfArrays(arr1,arr2)));
        System.out.println(unionUsingPointer(arr1, arr2));

    }
}
