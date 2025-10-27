package Exercicios;

import java.util.Scanner;

/* Faça um programa que receba três notas de um estudante, calcule e  mostre a média aritmética entre elas (este exercício é similar ao exemplo
mostrado a neste capítulo, mas leva em consideração três notas e não quatro). */

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é: " + media);

        sc.close();
    }
}
