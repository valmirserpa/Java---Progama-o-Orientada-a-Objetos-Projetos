package aula11bherana2;

public class Aula11bHerana2 {

    public static void main(String[] args) {


        /*        
Pessoa p1 = new Pessoa; - Pessoa não pode ser estancianda por ser abstrata
        irá apresentar erro.
         */
        Visitante v1 = new Visitante();
        v1.setNome("Valmir");
        v1.setIdade(34);
        v1.setSexo("M");
        System.out.println("");
        System.out.println("===============================");
        System.out.println(v1.toString());
        System.out.println("");
        System.out.println("===============================");

        /*Neste caso, visitante é uma classe pobre heradando todos os
        atributos da classe mãe, Pessoa*/
        Aluno a1 = new Aluno();

        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.pagarMensalidade();

        System.out.println(a1.toString());
        System.out.println("");
        System.out.println("===============================");

        
        Bolsita b1 = new Bolsita();
        b1.setNome("Ricardo");
        b1.setCurso("Engenharia");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        System.out.println(b1.toString());
        System.out.println("");
        System.out.println("===============================");
        
        
        
    }

}
