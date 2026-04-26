package basic_hashing;

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("now enter arrays: ");
        int[] arr = new int[n];
        try {
            for (int i = 0; i <n; i++) {
                arr[i] = sc.nextInt();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Entered moore values enter only "+n);
        }

        int[] hash = new int[n+1];
        for(int i =0;i<n;i++){
            hash[arr[i]] += 1;
        }

        System.out.println("Which no occurance to check: ");
        int x= sc.nextInt();
        System.out.println("wait...");
        System.out.println(hash[x]+ "times");
        sc.close();
    }
}
