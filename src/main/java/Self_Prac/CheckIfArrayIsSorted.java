package Self_Prac;

public class CheckIfArrayIsSorted {

    public static boolean isArraySorted(int[] arr){
        if(arr.length<2){
            return true;
        }
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {-7,-5,8,9,11,15};
        System.out.println(isArraySorted(arr));
    }
}
