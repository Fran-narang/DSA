package Self_Prac;

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr){

        int n = arr.length + 1;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If the current number is not present
            if (!found)
                return i;
        }
        return -1;
    }

    public static int missingNoXor(int[] arr){
            int n = arr.length + 1;
            int xor = 0;

            for (int i = 1; i <= n; i++)
            {xor ^= i;}       // XOR 1 to n
            for (int num : arr) xor ^= num;               // XOR with array

            return xor; // same numbers cancel out, missing remains
        }


    public static void main(String[] args) {

        int[] arr = {8,7,6,5,4,3,1};
        //System.out.println(findMissingNumber(arr));
        System.out.println(missingNoXor(arr));
    }
}
