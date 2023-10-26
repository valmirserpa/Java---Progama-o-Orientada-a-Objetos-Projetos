package ExerciciodeRepeticaoFor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        String nomedoProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0;

        for (; i < 3; i++) {

            System.out.println("Digite o nome do produto: ");
            nomedoProduto = leitorScanner.next();

            System.out.println("Digite o preço de custo: ");
            precoCusto = leitorScanner.nextFloat();

            System.out.println("Digite o valo de venda: ");
            precoVenda = leitorScanner.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Não houve prejuizo");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Houve prejuizo");
                } else {
                    System.out.println("Houve lucro");
                }
            }
            System.out.println(nomedoProduto + ", preço de custo= " + precoCusto
                    + ", preço de venda = " + precoVenda);
        }

        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        System.out.println("A média do preço de venda é de: " + (totalVenda / i));

    }

}
