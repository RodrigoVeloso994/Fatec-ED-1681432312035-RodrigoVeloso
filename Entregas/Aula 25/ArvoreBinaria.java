package aula25;

class No {
    int data;
    No esquerda;
    No direita;

    public No(int data) {
        this.data = data;
    }
}

public class ArvoreBinaria {
    No root;
    int count;

    public ArvoreBinaria() {
        root = null;
        count = 0;
    }

    public boolean isFull() {
        return count >= 20;
    }

    public void insert(int data) {
        if (!isFull()) {
            root = insertRecursive(root, data);
            count++;
        } else {
            System.out.println("A árvore está cheia (limite máximo de 20 elementos).");
        }
    }

    private No insertRecursive(No current, int data) {
        if (current == null) {
            return new No(data);
        }

        if (data < current.data) {
            current.esquerda = insertRecursive(current.esquerda, data);
        } else if (data > current.data) {
            current.direita = insertRecursive(current.direita, data);
        }

        return current;
    }

    public void inorderTraversal(No node) {
        if (node != null) {
            inorderTraversal(node.esquerda);
            System.out.print(node.data + " ");
            inorderTraversal(node.direita);
        }
    }
}
