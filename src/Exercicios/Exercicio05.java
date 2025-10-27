package Exercicios;

import java.util.Scanner;

/* Faça um programa que receba o salário base de um funcionário, calcule  e mostre o salário a receber, sabendo-se que o funcionário tem
gratificação de 5% sobre o salário base (que será acrescentado ao  salário) e paga imposto de 7% sobre este salário (o que será
descontado do salário).  */

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário base: ");
        float salarioBase = sc.nextFloat();

        float gratificacao = salarioBase * 0.05f;

        float salarioComGratificacao = salarioBase + gratificacao;

        float imposto = salarioComGratificacao * 0.07f;

        float  salarioAReceber = salarioComGratificacao - imposto;

        System.out.println("\n--- Detalhes do Salário ---");
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        System.out.printf("Gratificação (5%%): R$ %.2f\n", gratificacao);
        System.out.printf("Salário com Gratificação: R$ %.2f\n", salarioComGratificacao);
        System.out.printf("Imposto (7%% sobre o salário com gratificação): R$ %.2f\n", imposto);
        System.out.printf("Salário a Receber: R$ %.2f\n", salarioAReceber);

        sc.close();

    }
}
