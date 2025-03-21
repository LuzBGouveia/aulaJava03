package br.com.fiap;

import java.util.Scanner;

public class ExScan2 {
    public static void main(String[] args) {
        int ano, nasc, idade;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o ano atual: ");
            ano = scan.nextInt();
            System.out.println("Digite o ano de seu nascimento: ");
            nasc = scan.nextInt();

            idade = ano - nasc;
            System.out.println("Você tem " + idade + " anos.");
        } catch (Exception e) {
            System.out.println("Número inválido");
        }
    }
}
