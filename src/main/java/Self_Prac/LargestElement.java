package Self_Prac;

public class LargestElement {

    public static int largestElementInArray(int[] arr){
        int largest = arr[0];
        for(int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-5,-10};
        System.out.println(largestElementInArray(arr));
    }
}
