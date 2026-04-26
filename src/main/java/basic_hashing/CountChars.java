package basic_hashing;

import java.util.Arrays;
import java.util.Scanner;

public class CountChars {

    public int[] countCharacters(String s, char[] toSearch){
        char[] charArray = s.toCharArray();
        int[] hash = new int[26];
        for(int i=0;i<=s.length()-1;i++){
            hash[s.toCharArray()[i]-'a'] +=1;
        }
        int[] result = new int[toSearch.length];
        for(int i=0;i<toSearch.length;i++){
            result[i] = hash[toSearch[i]-'a'];
        }
            return result;
    }

    public static void main(String[] args) {
        CountChars obj = new CountChars();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter limit of query: ");
        int n = sc.nextInt();
        char[] query = new char[n];
        System.out.println("enter chars: ");
        for(int i=0; i<n;i++){
            query[i]=sc.next().charAt(0);
        }

        System.out.println(Arrays.toString(obj.countCharacters("preeti",query)));
    }
}
