package problems_on_array.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>arr.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }

    //moore voting algorithm
    public static int ggg(int[] arr){
        int count=1;
        int majority =arr[0];
        for(int i=1;i<arr.length;i++){
            if(count==0){
                majority=arr[i];
                count++;
            }
            else if(arr[i]!=majority){
                count--;
            }
            else {
                count++;
            }
        }
        int freq=0;
        for(int num:arr){
            if(num==majority){
                freq++;
            }
        }

        return freq>arr.length/2?majority:-1;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,7,7,7,7,1};
        //System.out.println(majorityElement(arr));
        System.out.println(ggg(arr));

    }
}
