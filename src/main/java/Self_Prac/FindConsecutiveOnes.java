package Self_Prac;

public class FindConsecutiveOnes {

    public static int findNoOfOnes(int[] arr){
        int max=0;
        int i=0;
        int length = 0;

        while(i<arr.length){
            if(arr[i]==1){
                length++;

                if (length>max) {
                    max=length;
                }
            }
            else {
                length=0;
            }
            i++;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,1,0,0,0,1,1,1,1,};
        System.out.println(findNoOfOnes(arr));
    }
}
