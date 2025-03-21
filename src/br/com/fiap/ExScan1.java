package br.com.fiap;

import java.util.Scanner;

public class ExScan1 {
    public static void main(String[] args) {
        double prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, media = 0;
        Scanner scan;
        try {
            scan = new Scanner(System.in); //instanciação do objeto scan
            System.out.print("Digite a primeira nota: ");
            prova1 = scan.nextDouble();
            System.out.print("Digite a segunda nota: ");
            prova2 = scan.nextDouble();
            System.out.print("Digite a terceira nota: ");
            prova3 = scan.nextDouble();
            System.out.print("Digite a quarta nota: ");
            prova4 = scan.nextDouble();

            media = (prova1 + prova2 + prova3 + prova4) / 4;
            System.out.println("A sua média é: " + media);
        } catch (Exception e) {
            System.out.println("número inválido");
        }
    }
}
