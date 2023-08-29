public class FibonacciComRecursividade {
    public static int fibonacci(int x) {
        if (x <= 1) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void main(String[] args) {
        System.out.println("Programa de Cálculo de Fibonacci com Recursividade");

        int vezes = 69;

        for (int i = 0; i < vezes; i++) {
            int resultado = fibonacci(i);
            System.out.println("Fibonacci(" + i + "): " + resultado);
        }
    }
}
