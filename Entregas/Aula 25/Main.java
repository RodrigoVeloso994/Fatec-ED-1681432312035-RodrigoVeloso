package aula25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite até 20 valores (ou prossiga com os números):");

        while (true) {
            String input = scanner.nextLine();

            if (input == null || tree.isFull()) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                tree.insert(value);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
            }
        }

        System.out.println("Árvore binária após a inserção dos valores:");
        tree.inorderTraversal();

        scanner.close();
    }
}
