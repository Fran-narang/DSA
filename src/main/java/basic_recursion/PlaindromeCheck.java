package basic_recursion;

public class PlaindromeCheck {
    public boolean palindromeCheck(int num, String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(num>s.length()-num-1){
            return true;
        }
        if(s.charAt(num)!=s.charAt(s.length()-num-1)){
            return false;
        }
        return palindromeCheck(num+1, s);
    }

    public static void main(String[] args) {
        PlaindromeCheck obj = new PlaindromeCheck();
        System.out.println(obj.palindromeCheck(1,"abb"));
    }
}
