package problems_on_array.medium;

public class BuySellStock {

    public static int bestTimeToBuyStock(int[] arr){
        int profit= 0;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                profit=arr[j]-arr[i];
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static int bestTimeToBuyStockOptimal(int[] arr){
        int profit=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            profit = Math.max(profit, arr[i]-min);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }


    public static void main(String[] args) {

        int[] arr ={7,1,2,7,8,10};
        System.out.println(bestTimeToBuyStock(arr));
        System.out.println(bestTimeToBuyStockOptimal(arr));

    }
}
