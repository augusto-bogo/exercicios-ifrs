package Exercicios;
import java.util.Scanner;

/* Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.
Sabe-se que F = 1,8 * C + 32. */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = sc.nextDouble();

        double temperaturaFahrenheit = temperatura * 1.8 + 32;

        System.out.printf("A temperatura de %.2f °C, convertida para Fahrenheit, é: %.2f °F\n", temperatura, temperaturaFahrenheit);

        sc.close();
    }
}
