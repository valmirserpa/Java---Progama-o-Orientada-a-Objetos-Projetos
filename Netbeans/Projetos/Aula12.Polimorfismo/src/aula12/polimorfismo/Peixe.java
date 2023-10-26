/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.polimorfismo;


/**
 *
 * @author valmir
 */
public class Peixe extends Animal{
    
    private String corEscama;

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }
    
 
   @Override
   public void locomover(){
       System.out.println("Nadando");
   }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo algas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Glub Glub");
    }
}
