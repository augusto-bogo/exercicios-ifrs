package Exercicios;

import java.util.Scanner;

//Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int subtracao = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + subtracao);

        sc.close();
    }
}
