import java.util.Scanner;

public class Main {

    public static int fatorial(int n) {
        if(n == 0 || n == 1) return 1;
        
        
        return n * fatorial(n -1);
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        Ex7 x5 = new Ex7();

        System.out.println(x5.somatorio(new));
    }
}