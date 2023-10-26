
package com.mycompany.aula09b.exerciciopraticopoo;

public class Aula09bExercicioPraticoPoo {

    public static void main(String[] args) {
      
        Pessoa p [] = new Pessoa[2];
        Livro l [] = new Livro[3];
        
        
        p[0]= new Pessoa("Valmir", 34, "M");
        p[1]= new Pessoa("Maria", 69, "F");
        
        l[0] = new Livro("Aprendendo Java", "Gustavo", 300, p[0]);
        l[1]=new Livro("Aprend Java Vol2", "Gustavo G", 250, p[1]);
        l[2] = new Livro("POO", "Guanabara", 350, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[2].detalhes());
    
    }
}
