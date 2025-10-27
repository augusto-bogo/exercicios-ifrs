package Exercicios;

import java.util.Scanner;

/*Faça um programa que receba dois números, calcule e mostre a divisão do primeiro pelo segundo. Sabe-se que o segundo número não pode ser
zero, portanto, não é necessário se preocupar com isso neste exercício.*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int divisao = num1 / num2;

        System.out.println(num1 + " / " + num2 + " = " + divisao);

        sc.close();
    }
}
