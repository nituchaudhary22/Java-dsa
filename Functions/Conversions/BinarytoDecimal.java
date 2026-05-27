package Functions.Conversions;

public class BinarytoDecimal {
    public static int Decimal(int num){
        int placevalue = 1;
        int result=0;
        while(num>0){
            int remainder = num%10;
            result =result+(remainder*placevalue);
            num=num/10;
            placevalue *=2;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=100;
        System.out.println(Decimal(num));
    }
}
