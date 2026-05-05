package problems_on_array;

public class LinearSearch {

    public static int linerSearch(int[] arr, int num){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {8,10,14,7,5,19};

        System.out.println(linerSearch(arr, 5));

    }
}
