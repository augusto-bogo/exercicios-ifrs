package Exercicios;

/* Faça um programa que calcule e mostre a área de um quadrado. Sabe se que A = lado x lado. */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = sc.nextFloat();

        double area = lado * lado;

        System.out.println("A area do quadrado é: " + area);

        sc.close();
    }
}
