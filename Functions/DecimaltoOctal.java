package Functions;

public class DecimaltoOctal {
    public static int Octal(int num){
        int result =0;
        int placeValue=1;
        while(num>0){
            int rem = num%8;
            result = result+(rem*placeValue);
            num=num/8;
            placeValue*=10;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=75;
        System.out.println(Octal(num));
    }

}
