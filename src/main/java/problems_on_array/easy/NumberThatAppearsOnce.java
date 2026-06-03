package problems_on_array.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearsOnce {

    public static int countOnce(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Integer key = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                key = entry.getKey();
            }
        }
        return key;
    }

    public static int countOnceXor(int[] arr){
        int result=0;
        for(int num:arr){
            result^=num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={5,1,1,5,4};
        System.out.println(countOnce(arr));
        System.out.println(countOnceXor(arr));
    }
}
