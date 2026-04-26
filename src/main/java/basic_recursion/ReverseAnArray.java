package basic_recursion;

public class ReverseAnArray {
//    public void reveseArray(int head, int tail, int[] arr){
//        int temp;
//        if(head>=tail){
//            for(int val : arr){
//                System.out.print(val+",");
//            }
//            return;
//        }
//        temp=arr[head];
//        arr[head] = arr [tail];
//        arr[tail]=temp;
//
//        reveseArray(head+1, tail-1, arr);
//    }

    public void reveseArrayUsingSinglePointer(int head, int[] arr){
        int temp;
        if(head>=arr.length-head-1){
            for(int val : arr){
                System.out.print(val+",");
            }
            return;
        }
        temp=arr[head];
        arr[head] = arr [arr.length-1-head];
        arr[arr.length-1-head]=temp;

        reveseArrayUsingSinglePointer(head+1, arr);
    }

    public static void main(String[] args) {
        ReverseAnArray obj = new ReverseAnArray();
        int[] arr = new int[]{2,5,7,1,9,3};
       // obj.reveseArray(0,arr.length-1,arr);
        System.out.println("-------------&&&&&&&&&&&&&&&&&&&&&-------------");
        obj.reveseArrayUsingSinglePointer(0,arr);
    }
}
