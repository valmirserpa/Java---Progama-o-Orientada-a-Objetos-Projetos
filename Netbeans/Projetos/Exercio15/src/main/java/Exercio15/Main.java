package Exercio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        if (numero >= 100 && numero <= 200) {

            System.out.println("O número está dentro do intervalo!");

        } else {

            System.out.println("O número está fora do intervalo!");

        }

    }

}
