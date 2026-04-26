package basic_hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountArrayUsingMap {

    public void countNoOfArray(int[] arr, int[] countOf){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length-1;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0;i<countOf.length-1;i++){
            System.out.println(countOf[i]+" ->"+map.getOrDefault(countOf[i],0));
        }


    }

    public static void main(String[] args) {
        CountArrayUsingMap obj = new CountArrayUsingMap();
        int[] query = new int[]{5,2,1,7};
        int[] input = new int[]{1,2,6,5,7,8,9,1,4,15,1,2,14,12,1};
        obj.countNoOfArray(input, query);
    }
}
