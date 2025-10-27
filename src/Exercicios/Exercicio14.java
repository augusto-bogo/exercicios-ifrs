package Exercicios;
import java.util.Scanner;

/* Sabe-se que o quilowatt de energia custa um quinto do salário mínimo.
Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
a. o valor de cada quilowatt;
b. o valor a ser pago por essa residência;
c. o valor a ser pago com desconto de 15%.  */

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Digite a quantidade de quilowatts consumida: ");
        double quilowatts = sc.nextDouble();

        double valorQuilowatt = salarioMinimo / 5;
        double valorTotal = quilowatts * valorQuilowatt;
        double desconto = valorTotal * 0.15;
        double valorPagar = valorTotal - desconto;

        System.out.printf("O valor de cada QuiloWatt é: R$ %.2f\n", valorQuilowatt);
        System.out.printf("O valor a ser pago pelo consumo na residência é: R$ %.2f\n", valorTotal);
        System.out.printf("O valor a ser pago, com o desconto de 15%% é: R$ %.2f\n", valorPagar);

        sc.close();
    }
}
