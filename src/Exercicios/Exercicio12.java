package Exercicios;
import java.util.Scanner;

/*  O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos
impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fábrica de um veículo, o percentual de
lucro do distribuidor e o percentual de impostos, calcule e mostre:
a. o valor correspondente ao lucro do distribuidor;
b. o valor correspondente aos impostos;
c. o preço final do produto.  */

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço de fábrica do veículo: ");
        double precoFabrica = sc.nextDouble();

        System.out.println("Qual o percentual de lucro do distribuidor: ");
        double lucroDistribuidor = sc.nextDouble();

        System.out.println("Qual o percentual de impostos: ");
        double impostos = sc.nextDouble();

        double lucro = precoFabrica * (lucroDistribuidor / 100);
        double imposto = precoFabrica * (impostos / 100);
        double precoFinal = precoFabrica + lucro + imposto;

        System.out.printf("O valor corersponde ao lucro do distribuidor: R$ %.2f\n", lucro);
        System.out.printf("O valor corersponde aos impostos: R$ %.2f\n", imposto);
        System.out.printf("O preço final do produto: R$ %.2f\n", precoFinal);

        sc.close();
    }
}
