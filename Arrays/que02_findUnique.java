package Arrays;

public class que02_findUnique {
    public static void main(String[] args) {
        int arr[]={21,7,3,21,5,7,5};
        System.out.println("Unique Element : " + findUnique(arr) );
    }
    public static  int findUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }
}
