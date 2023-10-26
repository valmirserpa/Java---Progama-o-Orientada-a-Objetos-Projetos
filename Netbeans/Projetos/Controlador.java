
package Aula06Encapsulamento;
public interface Controlador {
   
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fechaMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
    /* abstract - significa que o código do métdodo será desenvolvido em outro
    lugar e não dentro da interface
    
    */ 
    
    
    
}
