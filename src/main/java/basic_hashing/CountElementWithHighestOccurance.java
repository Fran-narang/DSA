package basic_hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountElementWithHighestOccurance {
    public int mostElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        CountElementWithHighestOccurance obj = new CountElementWithHighestOccurance();
        int[] arr = new int[]{7,1,12,14,15,15,15,14,78,1,2,1,2};
        System.out.println(obj.mostElement(arr));
    }
}
