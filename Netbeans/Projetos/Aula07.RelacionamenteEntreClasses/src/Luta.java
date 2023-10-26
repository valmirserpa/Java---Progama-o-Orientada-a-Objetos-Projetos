

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    /* Tipo abstrato de dados - Desafiado será um instân
    cia da classe lutador, ou seja, será um objeto de lutador
    A classe Luta "tem um" atributo que pertece a classe Lutador
    se trata de uma estância que pertence a classe lutador
     */
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    
    public void marcarLuta(Lutador l1, Lutador l2) {

        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

        /*
REGRAS DA LUTA

* Só pode ser marcada entre lutadores da mesma categoria.
* Desafiado e desafiante devem ser lutadores
diferentes.
º Só pode acontecer se estiver aprovada.
º Só pode ter como resultado a vitória de um dos lutadores ou o empate.
         */
    }

    public void lutar() {

        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random(); // crei uma classe para gerar num aleatórios para teste do nosso código
            int vencedor = aleatorio.nextInt(3);// vai receber 3 resultados - 1, 2, 3;

            System.out.println("============ RESULTADO DA LUTA ===========");
            switch (vencedor) {

                case 0: //empate

                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();

                    break;

                case 1: // desafiado vence

                    System.out.println("Vitória de " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();

                    break;

                case 2: // desafiante vence
                    System.out.println("Vitória de " + desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();

                    break;

            }
            System.out.println("==========================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }

    }

}
