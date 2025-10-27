package Exercicios;
import java.util.Scanner;

/* Faça um programa que calcule e mostre a área de um triângulo. Sabe se que: Área = (base x altura) / 2. A base e altura devem ser informadas
pelo usuário.  */

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Área do triângulo --");
        System.out.println("Digite o valor da base: ");
        float base = sc.nextFloat();
        System.out.println("Digite o valor da altura: ");
        float altura = sc.nextFloat();

        float area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2f\n", area);

        sc.close();
    }
}
