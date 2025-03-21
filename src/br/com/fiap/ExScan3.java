package br.com.fiap;

import java.util.Scanner;

public class ExScan3 {
    public static void main(String[] args) {
        float PI = 3.14f, raio, area;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o raio do circulo: ");
            raio = scan.nextFloat();

            area = PI * (raio*raio);
            System.out.println("A área do circulo é: " + area);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
