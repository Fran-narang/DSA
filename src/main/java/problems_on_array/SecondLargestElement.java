package problems_on_array;

public class SecondLargestElement {

    //Brute force --> first sort then find second
    public static int secondMaxBrute(int[] array){

        int largest = array[array.length-1];
        int secondlargest = 0;
        if(array.length<2) return -1;
        for(int i=0;i<array.length;i++){
            if(array[i]!= largest){
                secondlargest= array[i];
            }
        }
        return secondlargest;
    }

    public static int secondMaxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        if(arr.length<2)return -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]!=max && arr[i]>second){
                second=arr[i];
            }
        }
        return (second == Integer.MIN_VALUE)?-1:second;
    }
    public static void main(String[] args) {
        int[] arr = {-8,-10,15,2,20,85,-78};
        int[] arr1 = {10, 10, 10, 10, 10};
        int[] arr2 = {8, 8, 7, 6, 5};
        int[] array = {1,2,5,7,18,19,25,25,25};
        System.out.println(secondMaxNum(arr1));

        System.out.println(secondMaxBrute(array));

    }
}
