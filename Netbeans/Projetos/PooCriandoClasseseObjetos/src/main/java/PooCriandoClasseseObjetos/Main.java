package PooCriandoClasseseObjetos;

public class Main {

    public static void main(String[] args) {

        //(1ª ESTÂNCIA)
        Caneta c1 = new Caneta(); // CREI O PRIMEIRO OBJETO DA CLASSE 
        /* Raciocício: Referente a classe Caneta, eu quero criar um objeto chamado de
        c1 e ele será um novo objeto da classe Caneta*/

        //DEFININDO OS ATRIBUTOS DO MEU OBJETO
        c1.cor = "Azul"; //C1, terá a cor azul
        c1.ponta = 0.5f; // C1, terá a ponta 0,5
        c1.tampada = false; // C1, a caneta estará destampada

        System.out.println("-------------------------------------------");

        // USO OS MÉTODOS PARA ESCOLHER QUAL FUNCIONALIDADE EU QUERO EXECUTAR
        c1.destampar(); // Eu quero a caneta destampada/
        c1.rabisca(); //E eu quero rabiscar com ela
        System.out.println("");
        c1.condicao(); //

        System.out.println("-------------------------------------------");

        c1.tampar(); // NA CONDIÇÃO DE CANETA TAMPADA
        c1.rabisca();
        System.out.println("");
        c1.condicao();

        System.out.println("-------------------------------------------");

        // (2ª ESTÂNCIA)
        Caneta c2 = new Caneta(); // CRIEI O SEGUNDO OBJETO DA CLASSE;

        c2.modelo = "Cristal";
        c2.cor = "Preta";
        c2.tampada = false;
       
        c2.destampar();
        c2.rabisca();
        System.out.println("");
        c2.condicao();

    }

}
