package Functions;

import java.util.Scanner;

public class StrongNumber {
    public static int Factorial(int n){
        int factorial =1;
        for(int i=2;i<=n;i++){
            factorial=factorial*(i);
        }
        return factorial;
    }
    public static boolean StrongNumberorNot(int num){
        int original =num;
        int sum =0;
        while (num>0) {
            int digit =num%10;
            sum =sum+Factorial(digit);
            num =num/10;
        }
        return sum==original;
        
}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num =sc.nextInt();
    System.out.println(StrongNumberorNot(num));
}
}
