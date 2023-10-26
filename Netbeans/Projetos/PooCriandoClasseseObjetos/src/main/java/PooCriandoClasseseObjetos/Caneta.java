package PooCriandoClasseseObjetos;

public class Caneta {

    // ATRIBUTOS OU CARACTERÍSTICAS
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    
    
    // MÉTODOS OU FUNCIONALIDADES
    void rabisca() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true; // SE EU QUERO TAMPAR A CANETA
    }

    /* THIS ---> SE REFERE AO PRÓPRIO OBJETO QUE O CHAMOU,
                            NESTE CASO, O OBJETO C1 - SEMPRE QUE VOCÊ QUISER MO-
                            DIFICAR UM ALGUM ATRIBUTO DENTRO DA PRÓPRIA CLASSE, 
                            COLOQUE "THIS" NA FRENTE DA LINHA QUE IRÁ MEXER NO
                            ATRIBUTO.*/
    void destampar() {
        this.tampada = false; // SE EU QUERO DESTAMPAR A CANETA
    }

    
    
    // STATUS
    void condicao() {
        System.out.println("Um caneta " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("Ponta " + this.ponta);
        System.out.println(" Carga " + this.carga);
        System.out.println(" Modelo " + this.modelo);
    }

}
