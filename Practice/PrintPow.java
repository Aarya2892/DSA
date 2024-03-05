package Practice;

public class PrintPow {
    public static int pow(int x, int n){
        int pow = (int)Math.pow(x, n);
        return pow;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
