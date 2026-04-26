package basic_math;

import java.util.Scanner;

public class PalindromeNumber {

    public boolean palindromeNumber(int num){
        int reverseNum =0;
        int copyNum = num;
        while (num>0){ //here it should be num>0 only not num!=0 as for -ve val -212 palindromw becomes 212-
            int rem = num%10;
            num/=10;
//            if(reverseNum>Integer.MAX_VALUE/10 || reverseNum<Integer.MIN_VALUE/10)
//            {
//                return false;
//            }
            reverseNum=reverseNum*10+rem;
        }
        if(copyNum==reverseNum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        PalindromeNumber obj = new PalindromeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.palindromeNumber(sc.nextInt()));
        sc.close();
    }
}
