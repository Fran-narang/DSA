package basic_recursion;

public class PrintName {
    public void print(int i, int n){

        if(i>n){
            return;
        }
        System.out.println("name");
        print(i+1,n);

    }

    public static void main(String[] args) {
        PrintName obj = new PrintName();
        obj.print(1,5);
    }
}
