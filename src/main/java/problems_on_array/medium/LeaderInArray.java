package problems_on_array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {

    public static List<Integer> leaderInArrayBrute(int[] arr){

        List<Integer> leader = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                leader.add(arr[i]);
            }
        }

        return leader;
    }

    public static List<Integer> leaderInArrayOptimal(int[] arr){

        List<Integer> leader = new ArrayList<>();
        int max = arr[arr.length-1];
        leader.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                leader.add(max);
            }
        }
        Collections.reverse(leader);
        return leader;
    }

    public static void main(String[] args) {

        int[] arr = {5,6,17,9,6,8,7,2};
        System.out.println(leaderInArrayBrute(arr));
        System.out.println(leaderInArrayOptimal(arr));
    }
}
