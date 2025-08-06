import java.util.Scanner;

public class Main {

    public static int fatorial(int n) {
        if(n == 0 || n == 1) return 1;
        
        
        return n * fatorial(n -1);
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.println("Qual o valor de n?:  ");
        
        int n = in.nextInt();
        
        int result = fatorial(n);
        System.out.println("Resultado da funcao:  " + result);
    }
}