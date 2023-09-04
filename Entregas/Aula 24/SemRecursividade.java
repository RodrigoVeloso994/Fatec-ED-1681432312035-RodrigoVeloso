package teste;

import javax.swing.JOptionPane;

public class SemRecursividade {

    public static void main(String[] args) {
        String inputDecimal = JOptionPane.showInputDialog("Digite um número decimal:");
        int decimal = Integer.parseInt(inputDecimal);

        String inputBase = JOptionPane.showInputDialog("Escolha a base de conversão (2, 8 ou 16):");
        int selecao = Integer.parseInt(inputBase);

        String resultado = "";

        if (selecao == 2 || selecao == 8 || selecao == 16) {
            StringBuilder sb = new StringBuilder();
            
            if (selecao == 2) {
                int[] binario = new int[32];
                for (int i = 0; decimal > 0; i++) {
                    binario[i] = decimal % 2;
                    decimal /= 2;
                }
                for (int i = 31; i >= 0; i--) {
                    if (binario[i] != 0 || i == 0) {
                        sb.append(binario[i]);
                    }
                }
            } else if (selecao == 8) {
                int[] octal = new int[32];
                for (int i = 0; decimal > 0; i++) {
                    octal[i] = decimal % 8;
                    decimal /= 8;
                }
                for (int i = 31; i >= 0; i--) {
                    if (octal[i] != 0 || i == 0) {
                        sb.append(octal[i]);
                    }
                }
            } else if (selecao == 16) {
                for (int i = 0; decimal > 0; i++) {
                    int resultadoHexa = decimal % 16;
                    sb.insert(0, Integer.toHexString(resultadoHexa).toUpperCase());
                    decimal /= 16;
                }
            }
            
            resultado = sb.toString();
        } else {
            resultado = "Base de conversão inválida!";
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}

