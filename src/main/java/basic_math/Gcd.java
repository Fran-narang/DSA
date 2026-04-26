package basic_math;

public class Gcd {

    public int gcdFinder(int num1, int num2){

        //brute force
//        int gcd = 1;
        int min = Math.min(num1, num2);

        for(int i =min;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        return 1;

    }

    // using eucledian

    public int gcdUsingEuclidean(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Gcd obj = new Gcd();
        System.out.println(obj.gcdFinder(55, 80));
        System.out.println(obj.gcdUsingEuclidean(55,80));
    }
}
