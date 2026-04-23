package basics.switch_case;

import java.util.Scanner;

public class NumToWeekDay {

    public String NumToWeekdayConverter(int input)
    {
        return switch(input){
            case 1 -> "Monday";
            case 2 -> "tuesday";
            case 3  -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "oyy tere baap nu banai h kya 7 din se jyda kch";
        };
    }

    public static void main(String[] args) {
        NumToWeekDay num = new NumToWeekDay();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(num.NumToWeekdayConverter(input));
        sc.close();
    }
}
