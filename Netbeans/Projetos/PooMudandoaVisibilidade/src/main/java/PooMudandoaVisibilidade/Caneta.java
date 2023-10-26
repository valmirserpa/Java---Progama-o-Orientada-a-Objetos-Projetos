package PooMudandoaVisibilidade;

public class Caneta {

    /*
    DIAGRAMA DE VISIBILIDADE DE ATRIBUTOS E MÉTODOS
    
    [ATRIBUTO]
    +MODELO
    +COR
    -PONTA
    #CARGA
    #TAMPADA
    
    [MÉTODOS]
    +ESCREVER()
    +RABISCAR()
    +PINTAR()
    -TAMPAR()
    -DESTAMPAR()
    
     */
    // ATRIBUTOS OU CARACTERÍSTICAS
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void condicao() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }

    // MÉTODOS OU FUNCIONALIDADES
    //  +RABISCAR() = PUBLIC
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    // - TAMPAR() = PRIVATE
    private void tampar() {
        this.tampada = true; // SE EU QUERO TAMPAR A CANETA
    }

    /* THIS ---> SE REFERE AO PRÓPRIO OBJETO QUE O CHAMOU,
                            NESTE CASO, O OBJETO C1 - SEMPRE QUE VOCÊ QUISER MO-
                            DIFICAR UM ALGUM ATRIBUTO DENTRO DA PRÓPRIA CLASSE, 
                            COLOQUE "THIS" NA FRENTE DA LINHA QUE IRÁ MEXER NO
                            ATRIBUTO.*/
    private void destampar() {
        this.tampada = false; // SE EU QUERO DESTAMPAR A CANETA
    }

    /* QUANDO O ATRIBUTO ESTIVER PRIVADO, PODEMOS ALTERAR USAR O PRÓPRIO
    MÉTODO DA CLASSE, PORQUE ELE FAZ PARTE DA PRÓPRIA CLASSE E DESDE QUE ELE 
    ESTEJA PUBLICO, COMO É O CASO DO MÉTODO RABISCAR*/
}
