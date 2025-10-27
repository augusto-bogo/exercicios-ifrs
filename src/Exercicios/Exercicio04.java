package Exercicios;

import java.util.Scanner;

/* Faça um programa que receba o preço de um produto, calcule e mostre  o novo preço, sabendo-se que este sofreu um desconto de 10%. Por
exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos  10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o
novo preço R$ 90,00.  */

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float valorProduto = sc.nextFloat();

        System.out.println("Seu produto tem um desconto de 10%.");

        float desconto = (valorProduto * 10) / 100;
        float novoValor = valorProduto - desconto;

        System.out.println("O valor final do seu produto é: R$" + novoValor);

        sc.close();
    }
}
