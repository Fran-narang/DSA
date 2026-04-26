package basic_recursion;

public class SumOfNTerms {
    //using parameters
   // int sum = 0;
//    public void printSum(int limit){
//        if(limit<1){
//            System.out.println(sum);
//            return;
//        }
//        sum+=limit;
//        printSum(limit-1);
//    }

    //functional recursion

    public int printSumUsingFunctional(int limit) {
        if (limit<0) {
            return 0;
        }
        return limit + printSumUsingFunctional(limit - 1);
    }

    public static void main(String[] args) {
        SumOfNTerms obj = new SumOfNTerms();
        //obj.printSum(18);
        System.out.println(obj.printSumUsingFunctional(4));
    }
}
