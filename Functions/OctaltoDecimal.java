package Functions;

public class OctaltoDecimal {
    public static int Decimal(int num) {
        int placevalue = 1;
        int result = 0;
        while (num > 0) {
            int remainder = num % 10;
            result = result + (remainder * placevalue);
            num = num / 10;
            placevalue *= 8;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 113;
        System.out.println(Decimal(num));
    }
}
