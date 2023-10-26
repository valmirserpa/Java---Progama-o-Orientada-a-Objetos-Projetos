package aula12.polimorfismo;

public class Aula12Polimorfismo {

    public static void main(String[] args) {

        //  Animal a1 = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
       a.locomover();
       p.locomover();
       r.locomover();
       m.locomover();
        
        System.out.println("==================================="); 
       
       SubCanguru c = new SubCanguru();
       SubCachorro k = new SubCachorro();
       
       c.locomover();
       k.locomover();
       k.emitirSom();
       
    }

}
