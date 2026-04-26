package basic_math;

import java.util.Scanner;

public class CountDigitOfNum {
    public int digitCount(int num){
        int count=0;
        while (num>0){
            num/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigitOfNum obj = new CountDigitOfNum();
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.digitCount(sc.nextInt()));
        sc.close();

    }
}
