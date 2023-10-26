package EstruturadeRepeticaoWhlle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        
        SE TRATA DE UMA ESTRUTURA DE REPETIÇÃO QUE NÃO SABEMOS A QUANTIDADE QUE 
        SERÁ EXECUTADA;
        DENTRO DO WHILE DEVEMOS COLOCAR UMA CONDIÇÃO LÓGICA DE PARADA;
        NESTE COLOCAMOS A CONDIÇÃO DE PARADA, SENDO O TOTAL DE ALUNOS MAIOR QUE 
        ZERO
        
         */
        Scanner leitor = new Scanner(System.in);

        int totalAlunos = 10;
        String nomeAluno;
        int idadeAluno;

        while (totalAlunos > 0) {

            System.out.println("Digite o nome do aluno: ");
            nomeAluno = leitor.nextLine();
            System.out.println("Digite a idade do aluno: ");
            idadeAluno = leitor.nextInt();

            System.out.println("O nome do aluno é " + nomeAluno + "e a sua "
                    + "idade" + " é " + idadeAluno);

            totalAlunos = totalAlunos - 1;

        }

    }

}
