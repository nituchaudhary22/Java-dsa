package Functions;

public class Replace0 {
    public static int convertfive(int num) {
        if(num ==0) return 5;
        int result =0;
        int p=1;
        while(num>0){
            int rem=num%10;
            if(rem == 0){
                rem = 5;
            }
            result = result+rem*p;
            num=num/10;
            p*=10;
        
    }
    return result;
}
public static void main(String[] args) {
    int num = 1004;
    System.out.println(convertfive(num));
}
}
