
public class Main {

    public static void main(String[] args) {

        Lutador l1 = new Lutador("Valmir", "Brasil", 34, 1.80f, 94, 10, 0, 0);
        l1.apresentar();
        l1.status();

        Lutador l2 = new Lutador("Vinícius", "Argentina", 0, 0, 0, 0, 0, 0);

        l2.setNome("Vinícius");
        l2.setAltura(2.00f);
        l2.setDerrotas(0);
        l2.setVitorias(12);
        l2.setEmpates(1);
        l2.apresentar();
        l2.status();

        /*Objetos são variáveis, só que eles são uma instância de uma classe,
        como são 6 lutadores, ao invés de criarmos l1, l2, l3 ... podemos criar 
        um vetor de 6 posições.
        
        Objetos são estâncias de classe, eu preciso ter uma classe para instanciar
        um objeto.
         */
        Lutador l[] = new Lutador[6];

        // Referente a classe Lutador
        
        l[0] = new Lutador("Petty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 12, 11, 2);
        l[2] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[3] = new Lutador("UFO Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[4] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        l[5] = new Lutador("Snapshadow", "EUA", 35, 1.80f, 80.9f, 12, 2, 1);

        l[3].ganharLuta();
        l[3].ganharLuta();
        l[3].apresentar();

        // Referente a classe Luta
        
        Luta combate01 = new Luta();
        
        combate01.marcarLuta(l[0], l[1]);
        combate01.lutar();
        l[0].status();
        System.out.println("");
        l[1].status();
        System.out.println("--------------------------------------");
        
        
        Luta combate02 = new Luta();
        
        combate02.marcarLuta(l[1], l[1]);
        combate02.lutar();
        System.out.println("--------------------------------------");
        
        
        Luta combate03 = new Luta();
        combate03.marcarLuta(l[1], l[4]);
        combate03.lutar();
        
        
        
        
    }

}
