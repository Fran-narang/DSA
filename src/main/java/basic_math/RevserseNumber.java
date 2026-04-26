package basic_math;

import java.util.Scanner;

public class RevserseNumber { //1534236469


    public int reversed(int num){
        int reverseNum=0;
            while (num != 0) {
                int rem = num % 10;
                num /= 10;
                if(reverseNum>Integer.MAX_VALUE/10 || reverseNum<Integer.MIN_VALUE/10)
                {
                    return 0;
                }
                reverseNum = reverseNum * 10 + rem;
            }
        return reverseNum;
    }

    public static void main(String[] args) {

        RevserseNumber obj = new RevserseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.reversed(sc.nextInt()));
        sc.close();
    }
}
