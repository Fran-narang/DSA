package basic_math;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {

    // O(n) time complexitiy
    public void printDivisors(int num){

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i +", ");
            }
        }
    }

    public void printDivisorsLogComplexity(int num){
        List<Integer> factors = new ArrayList<>();
        //O(num)
        for(int i=1;i*i<=num;i++){ //math.sqrt itself will take time so inated do i*i<=num
            if(num%i==0){
                factors.add(i);
                if((num/i)!=i){
                    factors.add(num/i);
                }
            }
        }
        // O(factors log factors)
        factors.sort((x,y)->x-y);
        System.out.println(factors);

    }

    public static void main(String[] args) {
        PrintAllDivisors obj = new PrintAllDivisors();
        obj.printDivisors(36);
        System.out.println("------------------");
        obj.printDivisorsLogComplexity(24);
    }
}
