package Aula05b.ExemploPraticoPoo;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    // Métodos personalizados
    public void abrirConta(String tipodeconta) {

        this.setTipo(tipodeconta); // o (tipoconta) será o parâmetro para informar o tipo da conta que foi aberta
        this.setStatus(true); // como no constructo eu defini que por padrão a conta está fehcada, aqui estou definindo que a conta pode ser aberta

        if (tipodeconta == "CC") {
            this.setSaldo(50);
        } else if (tipodeconta == "CP") {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso."); // Sinalizo ao usuário que a conta está abeta

        /*Parâmentro:
          Tipo de conta, CC ou CP, quem tem CC ganha 100 e CP 150
         */
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser encerrada com saldo positivo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não ser encerrada com saldo negativo.");
        } else {
            this.setStatus(false); // Aqui estou dando o comando para encerrar a conta
            System.out.println("Conta encerrada com sucesso."); // Em seguinda sinalizando ao usuário que a conta está fechada
        }

        /*Parâmentro: Não pode ter saldo negativo ou positivo*/
    }

    public void depositar(float deposito) {
        if (this.getStatus()) { // Nesta condição preciso verifcar se a conta está aberta, colocando somente this.getstatus(), por padrão entende como TRUE
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito realizado com sucesso na conta de" + this.getDono());
        } else {
            System.out.println("Impossível depositar! Conta não está aberta.");
        }

        /* Método utilizado para o cliente relizar depósito.*/
    }

    public void sacar(float valordoSaque) {

        if (this.getStatus()) {

            if (this.getSaldo() >= valordoSaque) {
                this.setSaldo(this.getSaldo() - valordoSaque);
                System.out.println("Saque realizado com sucesso");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de conta fechada");

        }

        /*  
        A forma como eu fiz não está errada, mas não estou usando os métodos
        acessores que é a forma correta.
       
        if (status == true || saldo > valordoSaque) {
            setSaldo(getSaldo() - valordoSaque);
        } else {
            System.out.println("Não é possível realizar saque.");
        }
         */
 /* Condições: 1- A conta deverá está ativa e com saldo positivo*/
    }

    public void pagarMensal() {
        int tarifa = 0;

        if (this.getTipo() == "CC") {
            tarifa = 12;
        } else if (this.getTipo() == "CP") {
            tarifa = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - tarifa);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossível pagar com uma conta fechada!");
        }

        /*Condição: 
        1- A conta deve está ativida
        2- Se conta for CC pagará R$ 12,00 se for CP pagará R$ 20,00*/
    }

    public void situacaodaConta() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
  
    
    /* Métodos especiais (Construtor e Getters/Setters)*/
    //Método Construtor 
    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;

        /*
         Métodos Construtor
         Estou definindo que todas as contas abertas comecarão com saldo zerado 
         e com status fechada
         */
    }

    
    // Métodos Get and Set
    public void setNumConta(int numConta) {
        this.numConta = numConta;

        /* o set precisa de parâmentro porque ele vai modificar o atributo
        sendo o numConta uma variável qualquer, não é atributo*/
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

}
