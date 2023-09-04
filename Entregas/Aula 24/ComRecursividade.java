package teste;

import javax.swing.JOptionPane;

public class ComRecursividade {

    public static String converterBase(int numero, int base) {
        if (numero == 0) {
            return "";
        } else {
            int conta = numero % base;
            return converterBase(numero / base, base) + conta;
        }
    }

    public static void main(String[] args) {
        int decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal: "));
        int selecao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a base de conversão (2, 8, ou 16): "));

        String resultado = "";

        if (selecao == 2 || selecao == 8 || selecao == 16) {
            resultado = converterBase(decimal, selecao);
        } else {
            resultado = "Base de conversão inválida!";
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}

