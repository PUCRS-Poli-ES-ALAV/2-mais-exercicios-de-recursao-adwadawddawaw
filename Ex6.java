public class Ex6 {
    public String convbase2(int n) {
        if(n == 0) return "0"; 
        if(n == 1) return "1";

        int k = n % 2;

        return convbase2(n / 2) + Integer.toString(k);
    } 
}