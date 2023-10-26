package aula12.polimorfismo;


public abstract class Animal {

    /*sempre que tiver métodos abstrados a minha classe também será abstrata
    Classe abstrata não pode ser usada como método, só server para efeitos
    de herança
     */
 /*Os atributos estão como protegidos para serem utilizados nas 
    classes filhos*/
    protected float peso;
    protected int idade;
    protected int membros;
    

    /*Todos os métodos abstratos não possuem códigos*/
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();


}
