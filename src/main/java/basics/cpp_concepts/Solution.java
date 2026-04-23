package basics.cpp_concepts;

public class Solution {
    public int getStringLength(String s)
    {
        return s.length();
    }
    public char getCharAtPlace(String s, int index){
        return s.charAt(index);
    }
    public void traverseChar(String s){
        for(int i =0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getStringLength("hello"));
        System.out.println(solution.getCharAtPlace("hello", 2));
        solution.traverseChar("hello");
    }
}
