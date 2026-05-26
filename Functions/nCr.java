package Functions;
public class nCr {
    public static int Combination(int n,int r){
        if(r>n) return 0;
        int min=0;
        if((n-r)<r){
            min = n-r;
        }else{
            min =r;
        }
        int result =1;
        for(int i=0;i<min;i++){
            result = (result*(n-i)/(i+1));
        }
        return result;
    }
    public static void main(String[] args) {
        int n =10;
        int r =4;
        System.out.println(Combination(n, r));
    }
}
