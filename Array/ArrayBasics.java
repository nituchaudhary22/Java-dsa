package Array;
import java.util.Scanner;
public class ArrayBasics {
    public static void main(String[] args) {
      //  int[] arr ; //declaration
      //  int[] arr = {1,2,34,5}; //initialisation
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        

    }
}
//Why 0 indexing in arrays?
//