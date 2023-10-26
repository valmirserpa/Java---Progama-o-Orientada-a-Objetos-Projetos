/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.polimorfismo;

/**
 *
 * @author valmir
 */
public class SubCachorro extends Mamifero{
    
    @Override
    public void locomover(){
        System.out.println("Ande balaçando o rabo!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
}
