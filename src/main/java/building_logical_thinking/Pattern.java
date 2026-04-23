package building_logical_thinking;

public class Pattern {

    public void pattern1() {
        //****
        //****
        //****
        //****


        for(int i=1;i<=4;i++)
        {

            for(int j=1;j<=4;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void pattern2(){

        //*
        //**
        //***
        //****

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(){
        //1
        //12
        //123
        //1234

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(){
        //1
        //22
        //333
        ///4444
        for(int i=1;i<=4;i++){

            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(){
        //****
        //***
        //**
        //*

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=(4-i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(){
        //1234
        //123
        //12
        //1

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=(4-i)+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern7() {
        //      *
        //     ***
        //    *****
        //   *******
        //my observation each row prints odd no of starts
        // 2 * row no - 1

        for (int i = 1; i <= 4; i++) {
            //for space
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void pattern8() {
        //   *******
        //    *****
        //     ***
        //      *
        //my observation each row prints odd no of starts
        // 2 * (total rows-current row)+1

        for (int i = 1; i <= 4; i++) {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*(4-i)+1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void pattern9() {
        //       *
        //      ***
        //     *****
        //     *****
        //      ***
        //       *
        //my observation each row prints odd no of starts
        // 2 * row no - 1

        //fist half pattern
        for(int i=1;i<=4;i++)
        {
            //for space
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }
            //for pattern
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            //space
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            //pattern
            for (int j = 1; j <= (2*(4-i)+1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void pattern10(int n) {
        //     *
        //     **
        //     ***
        //     ****
        //     ***
        //     **
        //     *
        //my observation each row prints odd no of starts
        // no of rows is printed

        //fist half pattern
        for(int i=1;i<=2*n-1;i++)
        {
            //for pattern
            int totalToPrint=i;
            if(i>n)
                totalToPrint = 2*n-i;
            for(int j=1;j<=totalToPrint;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n){

        int print;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            { print=1;}
            else
            {print=0;}
            for(int j=1;j<=i;j++)
            {
                System.out.print(print);
                print = 1-print;
            }
            System.out.println();
        }
    }

    public void pattern12(int n){


        for(int i=1;i<=n;i++)
        {
           // int flag=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
               // flag = flag+1;
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
              //  flag = flag-1;
                System.out.print(j);

            }

            System.out.println();
        }
    }

    public void pattern13(int n){
        int flag = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(flag);
                System.out.print(" ");
                flag=flag+1;
            }
            System.out.println();
        }
    }

    public void pattern14(int n){

        for(int i=1;i<=n;i++){
            char x='A';
            for(int j=1;j<=i;j++){
                System.out.print(x);
                x= (char) (x+1);
            }
            System.out.println();
        }
    }

    public void pattern15(int n){

        for(int i=1;i<=n;i++){
            char x='A';
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print(x);
                x= (char) (x+1);
            }
            System.out.println();
        }
    }

    public void pattern16(int n){

        char x='A';
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(x);
            }
            x= (char) (x+1);
            System.out.println();
        }
    }

    public void pattern17(int n){


        for(int i=1;i<=n;i++){
            char x='A';

            //for space

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(x);
                if(j<breakpoint)
                {
                    x++;
                }

                else {
                    x--;
                }

            }

            System.out.println();
        }
    }

    public void pattern18(int n){
      //  char x = 'E';
        for(int i=1;i<=n;i++){
            for(char c = (char) ('E'-i+1); c<='E'; c++){
                System.out.print(c);
                System.out.print(" ");
//                x++;
            }
            System.out.println();
            //x= (char) (x-i-1);
        }
    }

    public void pattern19(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            //for space
            for(int j=2;j<2*i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=0;j<2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern20(int n){
//
//        //upper outer loop
//        for(int i=1;i<=n;i++){
//
//            //for stars
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            //for spaces
//
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//
//            //for stars
//
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //lower outer loop
//        for(int i=1;i<=n;i++){
//
//            //for stars
//            for(int j=1;j<=(n-i)+1;j++){
//                System.out.print("*");
//            }
//
//            //for spaces
//
//            for(int j=3;j<=2*i;j++){
//                System.out.print(" ");
//            }
//
//            //for stars
//
//            for(int j=1;j<=(n-i)+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int space=2*n-2;
        //fist half pattern
        for(int i=1;i<=2*n-1;i++)
        {
            //for pattern
            int totalToPrint=i;

            if(i>n) {
                totalToPrint = 2 * n - i;
            }
            for(int j=1;j<=totalToPrint;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=totalToPrint;j++){
                System.out.print("*");
            }
            if(i>=n){
                space+=2;
            }
            else {
                space-=2;
            }
            System.out.println();
        }
    }

    public void pattern21(int n){

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        //pattern.pattern1();
       // System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
       // pattern.pattern2();
       // System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
       // pattern.pattern3();
        //pattern.pattern4();
        //pattern.pattern5();
       // pattern.pattern6();
       //  pattern.pattern7();
        //pattern.pattern8();
       // pattern.pattern9();
        //pattern.pattern10(5);
       // pattern.pattern12(6);
        //pattern.pattern13(5);
        //pattern.pattern14(5);
       // pattern.pattern15(6);
        //pattern.pattern16(5);
       // pattern.pattern17(5);
       // pattern.pattern18(5);
        //pattern.pattern19(7);
        //pattern.pattern20(5);
        pattern.pattern21(5);
    }
}
