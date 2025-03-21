package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite um número inteiro");
            num1 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Digite outro número inteiro");
            num2 = Integer.parseInt(aux);
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "Valor 1: " + num1 + "\nValor 2: " + num2 + "\nResultado: " + resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
