package basic_recursion;

public class PrintReverse {

    public void printReverse(int from, int to){
        if(from==to){
            return;
        }
        System.out.println(from);
        printReverse(from-1, to);
    }

    public static void main(String[] args) {
        PrintReverse obj = new PrintReverse();
        obj.printReverse(50, 1);
    }
}
