package br.com.fiap;

import javax.swing.*;

public class ExJOption2 {
    public static void main(String[] args) {
        int ano, nasc, idade;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite o ano atual");
            ano = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Digite o ano de seu nascimento");
            nasc = Integer.parseInt(aux);

            idade = ano - nasc;
            JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
    }
}
