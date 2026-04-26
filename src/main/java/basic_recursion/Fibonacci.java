package basic_recursion;

public class Fibonacci {
    public int fibonacciNumber(int num){
        if(num<=1) {
            return num;
        }
        return fibonacciNumber(num-1)+fibonacciNumber(num-2);
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fibonacciNumber(18));
    }
}
