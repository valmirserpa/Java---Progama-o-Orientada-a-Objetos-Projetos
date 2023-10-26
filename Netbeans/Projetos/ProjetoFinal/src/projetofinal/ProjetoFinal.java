package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de Poo");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 HTML5");

        System.out.println("VÍDEOS\n=========================================");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Ninguém", 34, "m", "rimlav");
        g[1] = new Gafanhoto("creuza", 32, "Feminino", "creuzita");

        System.out.println("GAFANHOTOS\n=========================================");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("");

        // CLASSE VISUALIZAÇÃO
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // ASSISTE HTML
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]); // ASSISTE PHP
        vis[0].avaliar(87.0f);

        System.out.println("VISUALIZAÇÃO\n=========================================");
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }

}
