package basic_math;

public class PrimeNoChecker {

    public boolean checkPrimeNo(int num){

        if(num<=1 || num%2==0){
            return false;
        }
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNoChecker obj = new PrimeNoChecker();
        System.out.println(obj.checkPrimeNo(1));
    }
}
