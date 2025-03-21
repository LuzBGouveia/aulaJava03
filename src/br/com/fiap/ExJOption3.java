package br.com.fiap;

import javax.swing.*;

public class ExJOption3 {
    public static void main(String[] args) {
        float PI = 3.14f, raio, area;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite o raio do circulo");
            raio = Float.parseFloat(aux);

            area = PI * (raio*raio);
            JOptionPane.showMessageDialog(null, "A área do circulo é " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
    }
}
