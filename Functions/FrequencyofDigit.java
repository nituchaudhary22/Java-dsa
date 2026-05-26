package Functions;

import java.util.Scanner;

public class FrequencyofDigit {
    public static int Frequency(int num,int digit){
        int count= 0;
        while(num>0){
            int remainder = num%10;
            if(remainder == digit){
                count++;
            }
            num =num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        System.out.println(Frequency(num, digit));
    }
}
