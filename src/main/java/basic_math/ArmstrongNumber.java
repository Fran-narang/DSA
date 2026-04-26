package basic_math;

import java.util.Arrays;

public class ArmstrongNumber {

    public boolean checkArmstrong(int x){
        int isArmstrongNum=0;
        int copyx = x;
        int digits = String.valueOf(x).length();
        while (x>0){
            int last = x%10;
            x/=10;
            isArmstrongNum += (int) Math.pow(last, digits);
        }
        if(isArmstrongNum==copyx){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        System.out.println(obj.checkArmstrong(1634));
    }
}
