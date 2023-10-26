package PooGetterSettersConstructor;

public class Caneta {

    // ATRIBUTOS
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    /*
    Na construção de qualquer classe, basta informar os atributos, os métodos
    construtores e getters/setters são gerados pela IDE
    */
    
    
    //MÉTODO CONSTRUTOR
    public Caneta(String _kkk, int par, float par1, String azul) {
        this.tampar();
        this.cor = "Azul";

        /* 
        Aqui estou definindo as características do atributo usando um dos métodos
        e 
        A função do método construtor é inicializar um objeto recém-criado de 
        uma classe, definindo seus valores iniciais e configurando-o em um 
        estado válido e consistente. Ele é chamado automaticamente quando o 
        objeto é instanciado e executa as ações necessárias para preparar o 
        objeto para uso.
   
         PARA IDENTIFICAR O CONSTRUTOR, É O MESMO MÉTODO QUE TEM O NOME DA CLASSE*

           Também podemos criar construtores definindo parâmentros, como seria:
            
            public Caneta (String m, String c, float p)
            this.modelo =m;
            this.cor=c;
            this.ponta=p;
            this.tampar();
        
           //CRIANDO 2º MÉTODO CONSTRUTOR

            public Caneta(String m, float p, String c){
            this.modelo=m;
            this.ponta=p;
            this.cor=c;

         */
    }

    
    // CRIANDO O MÉTODO
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    // CREATING GET AND SET
    public String getModelo() {
        return this.modelo;

        // TODO MODELO GET E SET É PÚBLICO
        // TODO SET PRECISA RECEBER UM PARÂMETRO QUE É DO MESMO TIPO DO ATRIBUTO
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;

        /*
        
        Em um método, o comando return é usado para especificar o valor que deve
        ser retornado pelo método quando ele é chamado. No exemplo que você 
        forneceu, o método getPonta() retorna um valor do tipo float.
        
        Nesse caso, o return é usado para devolver o valor da variável ponta, 
        que é um atributo da classe ou do objeto atual. O this é utilizado para 
        referenciar o objeto atual em que o método está sendo chamado.
        
        */
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    // CREATING SITUAÇÃO
    public void situação() {
        System.out.println("SOBRE A CANETA!");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);

    }

}
