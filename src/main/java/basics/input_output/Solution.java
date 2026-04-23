package basics.input_output;

import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);

    }

    public static void main(String[] args)
    {
        Solution s = new Solution();
        s.printNumber(new Scanner(System.in));
    }
}
// passed test case