import java.util.Scanner;

public class Ex1 {
    
    public static int somatorio(int n) {
        if (n == 0) return 0;
        
        return n + somatorio(n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qual numero deseja?");
        int n = in.nextInt();
        int result = somatorio(n);
        System.out.println("resultado = " + result);
    }
}
