

public class Ex2 {
    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int resultado = fib(n);
        System.out.println("Fibonacci de " + n + " é " + resultado);
        sc.close();
    }
}
