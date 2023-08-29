public class FibonacciComFor {
    public static void main(String[] args) {
        System.out.println("Programa de Cálculo de Fibonacci sem Recursividade com For\n");

        int fibo1 = 1;
        int fibo2 = 1;

        int vezes = 5;

        for (int cont = 0; cont < vezes; cont++) {
            System.out.println(fibo1);

            int fibo3 = fibo2 + fibo1;

            fibo1 = fibo2;
            fibo2 = fibo3;
        }
    }
}
