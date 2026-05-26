package Functions;

public class nPr {
    public static int Permutation(int n,int r){
        int result=1;
        for(int i=0;i<r;i++){
            result =result*(n-i);
        }
        return result;
    }
    public static void main(String[] args) {
        int n =10;
        int r=4;
        System.out.println(Permutation(n, r));
    }
}
