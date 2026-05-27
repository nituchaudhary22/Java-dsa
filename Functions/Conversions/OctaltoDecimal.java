package Functions.Conversions;

public class OctaltoDecimal {
    public static int Decimal(int num){
        int placeValue =1;
        int result =0;
        while(num>0){
            int digit = num%10;
            result = result + digit*placeValue;
            num =num/10;
            placeValue*=8;
        }
        return num;
    }
    public static void main(String[] args) {
        int num =113;
        System.out.println(Decimal(num));
    }
}
