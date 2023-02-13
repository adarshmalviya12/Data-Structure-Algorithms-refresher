package Arrays;

import java.util.Scanner;

public class que01_targetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array size");
        int n = sc.nextInt();
        System.out.println("array element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();


//        int ans1 = pairSum(arr,target);
        int ans2 = triplateSum(arr,target);
        System.out.println(ans2);
        
    }

    // ---Pair Sum--
//    static int pairSum(int[] arr, int target){
//        int count =0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]+arr[j]==target){
//                    count++;
//                }
//            }
//        }
//            return count;
//    }

    //---- Triplate Sum----
    static int triplateSum(int[] arr,int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
