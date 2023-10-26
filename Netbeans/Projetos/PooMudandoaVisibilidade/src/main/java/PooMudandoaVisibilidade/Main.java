package PooMudandoaVisibilidade;

public class Main {

    public static void main(String[] args) {

        //(1ª ESTÂNCIA)
        Caneta c1 = new Caneta(); // CREI O PRIMEIRO OBJETO DA CLASSE 

        c1.modelo = "Bic cristal";
        c1.cor = "Asul";
        // VAI APRESENTAR PQ ESTÁ COM ACESSO PRIVADO: c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.condicao();

        c1.rabiscar();

    }
}
