package Array;
import java.util.Scanner;

public class MaxElement {
    public static  int Max(int[] arr){
    int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max Element is :" +Max(arr));
    }
}
