/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.polimorfismo;

/**
 *
 * @author valmir
 */
public class Mamifero extends Animal {

    private String corPelo;

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    /*Quando pussuo métodos abstrados da  clase que estou herdando eu preciso
    desenvolver*/
    @Override
    public void locomover() {
        System.out.println("Correndo");

    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override

    public void emitirSom() {
        System.out.println("Som do mamífero");
    }

}
