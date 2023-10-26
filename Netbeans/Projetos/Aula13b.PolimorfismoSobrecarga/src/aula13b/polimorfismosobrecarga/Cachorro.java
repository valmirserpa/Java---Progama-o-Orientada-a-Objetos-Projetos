package aula13b.polimorfismosobrecarga;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");

    }

    
    
    /*Exemplos de polimorfimos de sobrecarga
        - Assinaturas diferentes uma mesma classe
    assinatura: Tipos de variável e quantidade
  
    */
    
    public void reagir(String frase) {
        if ("Toma comida".equals(frase) || "Olá".equals(frase)) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
            
    }

    public void reagir(int hora, int minuto) {

        if (hora<12) {
            System.out.println("Abanar");
        } else if (hora>=18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }

        
        
    }

    public void reagir(boolean dono) {

        if (dono==true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
        
    }

    public void reagir(int idade, float peso) {

        if (idade<5 && peso<10) {
            System.out.println("Abanar");
        } else {
            System.out.println("Latir");
        }
        
        if (peso<10) {
            System.out.println("Rosnar");
                  
        } else {
            System.out.println("Ignorar");
        }
    }

}
