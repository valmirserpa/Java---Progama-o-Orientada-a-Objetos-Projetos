package PooGetterSettersConstructor;

public class Main {

    public static void main(String[] args) {

        Caneta c1 = new Caneta(" kkk", 0, 5.0F, "Azul");
        c1.situação();

        /* Em relação ao módelo mais complexo de CONSTRUCTOR
            Caneta c1 = new Caneta ("Bic", Amarelo, 0.4f)
            c1.situação();
     
        Caneta c2 = new Caneta (" kkk", 0,5f, "Azul");
        c2.situação();
         */
        
        c1.setModelo("BIC");
        c1.modelo = "bic";
        /* COMO MODELO ESTÁ PUBLICO, CONSIGO ALTERAR DIRETAMENTE
        NA CLASSE */

        c1.setPonta(0.5f);
        //c1.ponta=0.5f; // ERRO - ACESSO PRIVADO
        /* PONTA, ESTÁ COMO PRIVADO, SÓ É POSSÍVEL ALTERAR USANDO O SETTERS */

        c1.situação();

        System.out.println("");
        System.out.println("");

        //System.out.println("Tenho uma caneta " + c1.getModelo() + "e com ponta " + c1.ponta);
        /* NESTA SAÍDA DE DADOS, APRESENTAR ERRO, PORQUE PONTA É ACESSO PRIVADO, ENTÃO PARA PUXAR
        A INFORMAÇÃO DO ATRIBUTO, UTILIZAMOS O GETTER, COMO NO EXEMPLO ABAIXO */
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " e com ponta " + c1.getPonta());

    }

}
