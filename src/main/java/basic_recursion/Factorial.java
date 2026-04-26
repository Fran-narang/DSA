package basic_recursion;

public class Factorial {
    public int factorialUsingRecursion(int num){
        int factorialSum=0;
        if(num<0){
            throw new RuntimeException("number must be non negatie");
        }
        if(num==0||num==1){
            return 1;
        }
        return num*factorialUsingRecursion(num-1);
       // factorialSum=factorialUsingRecursion(num);*factorialUsingRecursion(num-1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.factorialUsingRecursion(-5));
    }
}
