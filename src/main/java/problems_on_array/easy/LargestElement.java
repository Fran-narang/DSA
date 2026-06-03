package problems_on_array.easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {-8,-10,15,2,20,85,-78};

        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
