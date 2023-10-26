
package com.mycompany.aula09b.exerciciopraticopoo;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto=false;
        this.pagAtual=0;
        this.leitor = leitor;
    }
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + 
                "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual + 
                "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + 
                ", idade="+leitor.getIdade()+", sexo="+leitor.getSexo()+ '}';
    }
    
    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual=p;
        if(p>this.totPaginas){
            this.pagAtual=0;
        }else{
        this.pagAtual=p;
        }
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
