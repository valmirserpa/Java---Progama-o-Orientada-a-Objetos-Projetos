/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.polimorfismo;

/**
 *
 * @author valmir
 */
public class Reptil extends Animal{
    
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo roedores");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som do réptil");
    }
}
