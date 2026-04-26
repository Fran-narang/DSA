package basic_recursion;

public class PrintNumbers {
    public void print(int initialNum, int finalNum){
        if(initialNum>finalNum){
            return;
        }
        System.out.println(initialNum);
        print(initialNum+1, finalNum);
    }

    public static void main(String[] args) {
        PrintNumbers obj = new PrintNumbers();
        obj.print(0,10);
    }
}
