
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    /*private int vitorias;
    private int derrotas;
    private int empates;*/

    /*Métodos especiais (
    1 - Construtores, 
    2 - Getters anda Setters, 
    3 - Métodos públicos)*/

    
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura,
            float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); /*Preciso atualizar o peso pelo setPeso, porque será
        o setPeso que irá atualizar também a SetCategoria*/
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    
    
    //Getters and Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); /* estou colocando dentro deste método a categoria
        porque eu quero a que ela seja definida automaticamente quando o peso
        for informado.*/
    }

    private void setCategoria() {

       if(this.getPeso()<52.2){
        this.categoria="Inválido";
       } if (this.getPeso()<=70.3){
       this.categoria="Leve";
       } if (this.getPeso()<=83.9){
       this.categoria="Médio";
       } if (this.getPeso()<=120.2){
       this.categoria="Pesado";
       } else{
           this.categoria="Inválido";
       }

        /* setCategoria não está recebendo parâmentro porque a informação para 
        este método será fornecida por outro método. Ou seja, será um "sub-método
        do setPeso*/
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    
        //Métodos públicos
    public void apresentar() {

        System.out.println("-----------------------------------");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Apresenamos o lutador "+this.getNome()+"!");
        System.out.println("Diretamente de "+ this.getNacionalidade()+"!");
        System.out.println("Com "+this.getIdade()+" anos e "+ this.getAltura()+" m de altura!");
        System.out.print("Pesando "+ this.getPeso() + " Kg, possui ");
        System.out.print(this.getVitorias()+ " vitórias, ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates!");
        System.out.println("-----------------------------------");
    }

    public void status() {

        System.out.println(this.getNome()+ " é um peso "+ this.getCategoria());
        System.out.print("ganhou "+ this.getVitorias() +" vezes, ");
        System.out.print("perdeu "+ this.getDerrotas()+ " vezes e ");
        System.out.println("perdeu "+ this.getEmpates()+ " vezes!");
               
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()-1);
    }

    public void empatarLuta() {
       this.setEmpates(this.getEmpates()+1);
    }
    
    
    
}
