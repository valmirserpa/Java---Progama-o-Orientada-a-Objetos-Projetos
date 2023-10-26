package com.mycompany.aula10b.heranca;

public class Aula10bHeranca {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setSexo("Maria");
        p3.setNome("Claúdio");
        p4.setNome("Fabiano");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Infomrárica");
        p3.setSalario(2500.f);
        p4.setSetor("Estoque");
        
      /*
        p1.receberAumento(500.20f);
        p2.mudarTralho();
        
        erro proposital para mostrar que um objeto só pode acessar
        seus métodos e atributos da classe mãe
        
        */
        
        
        
        System.out.println("==============================");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        
        
        
        
    }
}
