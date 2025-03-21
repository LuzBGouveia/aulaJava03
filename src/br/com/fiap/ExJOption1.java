package br.com.fiap;

import javax.swing.*;
import java.awt.*;

public class ExJOption1 {
    public static void main(String[] args) {
        double prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, media = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite a primeira nota: ");
            prova1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a segunda nota: ");
            prova2 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a terceira nota: ");
            prova3 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a quarta nota: ");
            prova4 = Double.parseDouble(aux);

            media = (prova1 + prova2 + prova3 + prova4)/4;
            JOptionPane.showMessageDialog(null, "A sua média é: " + media);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
