package Exercicios;

import java.util.Scanner;

/* Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1.760 jardas
Faça um programa que receba uma medida em pés, faça as  conversões a seguir e mostre os resultados.
a. polegadas;
b. jardas;
c. milhas. */

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a médida em pés: ");
        double pes = sc.nextDouble();

        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = pes / 5280;

        System.out.println("-- Medida em pés convertida para: --");
        System.out.println("Polegas = " + polegadas);
        System.out.println("Jardas = " + jardas);
        System.out.println("Milhas = " + milhas);

        sc.close();
    }
}
