package Exercicios;

import java.util.Scanner;

/* Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
programa que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu salário final. */

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual é seu salário fixo: ");
        float salarioFixo = sc.nextFloat();

        System.out.println("Digite o valor de suas vendas: ");
        float vendas = sc.nextFloat();

        float comissao = vendas * 0.04f;
        float salarioFinal = salarioFixo + comissao;

        System.out.println("-- Detalhes do salário --");
        System.out.printf("Salário fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Comissão (4%% das vendas): R$ %.2f\n", comissao);
        System.out.printf("Salário final (Salário fixo + Comissão): R$ %.2f\n", salarioFinal);

        sc.close();
    }
}
