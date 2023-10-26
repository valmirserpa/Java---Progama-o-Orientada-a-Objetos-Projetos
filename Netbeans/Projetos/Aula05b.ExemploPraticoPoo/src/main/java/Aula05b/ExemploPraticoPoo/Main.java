package Aula05b.ExemploPraticoPoo;

public class Main {
    
    public static void main(String[] args) {
        
        ContaBanco usuario1 = new ContaBanco(0, true);
        usuario1.setNumConta(1111);
        usuario1.setDono("Minha Chibata");
        usuario1.abrirConta("CC");
        usuario1.depositar(100);
        
        usuario1.situacaodaConta();
        
        System.out.println("-----------------------------------------------");
        
        ContaBanco usuario2 = new ContaBanco(0, true);
        usuario2.setNumConta(2222);
        usuario2.setDono("Creuza");
        usuario2.abrirConta("CP");
        usuario2.depositar(500);
        usuario2.sacar(100);
        usuario2.sacar(1000);
        usuario2.situacaodaConta();
        usuario2.fecharConta();
        
    }
    
}
