package aula13b.polimorfismosobrecarga;

public class Aula13bPolimorfismoSobrecarga {

    public static void main(String[] args) {

        Mamifero x = new Mamifero();
        x.emitirSom();
        System.out.println("========================================");

        Lobo l = new Lobo();
        l.emitirSom(); // mesmo método do anterior, mas saída diferente por conta do @override
        System.out.println("========================================");

        Cachorro c = new Cachorro();
        c.emitirSom();
        System.out.println("========================================");

        
        c.reagir("Olá");
            System.out.println("========================================");
        
        c.reagir("Vai apanhar");
            System.out.println("========================================");
            
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
            
    }

}
