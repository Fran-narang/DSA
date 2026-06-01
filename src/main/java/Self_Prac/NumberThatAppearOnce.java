package Self_Prac;

import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearOnce {

    public static int findNumberThatAppearOnce(int[] arr){

        int x = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                x = entry.getKey();
            }
        }
        return x;
    }

    public static int findNumberUsingXor(int[] arr){
        int x=0;
        for(int num:arr){
            x^=num;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr={1,4,2,1,2,4,5};
        //System.out.println(findNumberThatAppearOnce(arr));
        System.out.println(findNumberUsingXor(arr));
    }
}
