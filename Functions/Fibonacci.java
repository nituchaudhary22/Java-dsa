<<<<<<< HEAD
package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static int FibonacciSeries(int num){
        int num1 =0;
        int num2 =1;
        for(int i=0;i<=num;i++){
            System.out.println(num1);
            int next = num1 + num2;
            num1 =num2;
            num2 =next;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        FibonacciSeries(num);
    }
}
=======
package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static int FibonacciSeries(int num){
        int num1 =0;
        int num2 =1;
        for(int i=0;i<=num;i++){
            System.out.println(num1);
            int next = num1 + num2;
            num1 =num2;
            num2 =next;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        FibonacciSeries(num);
    }
}
>>>>>>> 6e1f7accc33d58f695467def97fa7b6c2348fc45
