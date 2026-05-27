package Functions.Conversions;

public class DecimaltoHex {
    public static String Hexadecimal(int num){
        
        String result = "";
        char[] character = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

        while (num > 0) {
            int remainder = num % 16;
            result = character[remainder] + result;
            num = num / 16;
        
    }

        return result;
    }


    public static void main(String[] args) {
       int num =255;
        System.out.println(Hexadecimal(num));
    }
}

