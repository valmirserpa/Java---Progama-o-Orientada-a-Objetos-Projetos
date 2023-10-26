/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.polimorfismo;

/**
 *
 * @author valmir
 */
public class Ave extends Animal{

private String corPena;

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }


    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar (){
        System.out.println("Comendo minhocas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }
    
}
