public class FibonacciComRecursividade {
    public static int fibonacci(int x) {
        if (x <= 1) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void printFibonacciSequence(int n, int vezes) {
        if (n <= vezes) {
            int resultado = fibonacci(n);
            System.out.println("Fibonacci(" + n + "): " + resultado);
            printFibonacciSequence(n + 1, vezes);
        }
    }

    public static void main(String[] args) {
        System.out.println("Programa de Cálculo de Fibonacci com Recursividade");

        int vezes = 7;
        printFibonacciSequence(1, vezes);
    }
}
