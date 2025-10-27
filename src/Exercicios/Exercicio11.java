package Exercicios;
import java.util.Scanner;

/*  Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
a. a idade dessa pessoa em anos;
b. a idade dessa pessoa em meses;
c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias);
d. a idade dessa pessoa em semanas (cada ano possui 52 semanas).  */

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idadeEmAnos = anoAtual - anoNascimento;
        int idadeEmMeses = idadeEmAnos * 12;
        int idadeEmDias = idadeEmAnos * 365;
        int idadeEmSemanas = idadeEmAnos * 52;

        System.out.println("Sua idade em anos: " + idadeEmAnos);
        System.out.println("Sua idade em meses: " + idadeEmMeses);
        System.out.println("Sua idade em dias: " + idadeEmDias);
        System.out.println("Sua idade em semanas: " + idadeEmSemanas);

        sc.close();
    }
}
