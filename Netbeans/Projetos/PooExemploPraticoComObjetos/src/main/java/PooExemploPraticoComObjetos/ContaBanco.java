package PooExemploPraticoComObjetos;

public class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo; // Conta Conrrete ou Conta Poupança
    private String dono; // Nome do cliente
    private float saldo; // Verificar o saldo da conta
    private boolean status; // Significa se está aberta ou fechada

    // MÉTODOS (FUNCIONALIDADES)------------------------------------------------
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") { // a IDE está sinalizando que deveríamos utilizar o "equals", é outra opção.
            // this.saldo=50; ---> Desta forma estamos alterando diretamento no atributo
            this.setSaldo(50); // ---> Mas devemos dá preferência aos métodos getters and setters
            System.out.println("Conta aberta com sucesso");
            System.out.println("Saldo attual: " + this.getSaldo());
        } else if (t =="CP") {
            // this.setSaldo(150);
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso");
            System.out.println("Saldo atual: " + this.getSaldo());
        }
    }

    public void fecharConta() { // Eu não posso fechar a conta com saldo positivo ou negativo;
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada com saldo positivo");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada com saldo negativo");
        } else {
            this.setStatus(false);
            /* Aqui defino como falso e autorizo o 
                                    fechamento da conta caso não tenha saldo
                                    positivo ou negativo*/
            System.out.println("Conta fechada com sucesso");/*Aqui estou avisando
                                                              que a conta foi 
                                                              fechada com sucesso*/

        }
    }

    public void depositar(float v) {/*---> A variável V irá armazenar o valor de 
                                        deposito e para depositar a conta deve
                                         primeiro está aberta*/

        if (this.getStatus() == true) {/*--->*Aqui estou verificando o status da 
                                             conta, se ela está aberta ou fechada, 
                                             por isso, se o status for TRUE, 
                                             significa, aberta*/

 /* this.saldo=this.saldo+v; ---> Desta forma estamos diretamento
                                             nos atributos, não devemos utilizar
                                             este método direto por segurança*/

            this.setSaldo(this.getSaldo() + v);/*---> Com a conta abertera e rea-
                                              lizando deposido, vou utilidar o
                                              SetSaldo para definir o novo valor
                                              da conta, para isso eu devo pegar 
                                              o saldo existe, ou sejta Get.Saldo 
                                              e somar com o novo valor que será 
                                              armazenado na variável v*/
            System.out.println("Deposito realizado na conta de " + getDono());

        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());

        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }

    // CONSTUTOR---------------------------------------------------------------
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    // GETTER AND SETTERS -----------------------------------------------------
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // MÉTODO STATUS-----------------------------------------------------------
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());

    }

}
