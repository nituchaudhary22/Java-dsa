package Array;

import java.util.Scanner;

public class LinearSearch {
    public static boolean Search(int target,int[] arr){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
            // break;
        }
        return false;
    }
    public static int Index(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Search(target ,arr));
        System.out.println(Index(arr,target));
    }
}
