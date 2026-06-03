package problems_on_array.medium;

public class CountConsecutiveOnes {

    public static int countOnes(int[] arr){
        int i=0;
        int count=0;
        int max=0;
        while (i< arr.length){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max=count;
                }

            } else{
                count=0;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr ={1,1,1,1,1,0,1,1,1,1,0};
        System.out.println(countOnes(arr));


    }
}
