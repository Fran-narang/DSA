package Self_Prac;

public class SecondLargestElement {

    public static int secondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length<1){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(secondLargest<arr[i]&&arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {15,20,15,11,20};
        System.out.println(secondLargestElement(arr));
    }
}
