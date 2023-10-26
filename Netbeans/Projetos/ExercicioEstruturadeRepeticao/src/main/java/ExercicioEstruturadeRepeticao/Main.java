/*
FAÇA UM ALGORITIMO QUE RECEBA N NÚMEROS E MOSTRE POSITIVO, NEGATIVO OU ZERO 
CADA NÚMERO

 */
package ExercicioEstruturadeRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um número: ");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é zero!");
            } else {
                if (numero > 0) {
                    System.out.println("O núemero é POSITIVO!");
                } else {
                    System.out.println("O numero é NEGATIVO!");
                }

            }
            System.out.println("Deseja continuar? S- sim / N - Não ");
            desejaContinuar = leitorScanner.next().charAt(0);
        }

    }

}
