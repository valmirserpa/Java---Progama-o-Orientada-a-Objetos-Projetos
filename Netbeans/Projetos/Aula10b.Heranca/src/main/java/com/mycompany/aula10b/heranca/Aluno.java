package com.mycompany.aula10b.heranca;

public class Aluno extends Pessoa {

    private int matri;
    private String curso;

    public Aluno() {
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatri() {
        return matri;
    }

    public String getCurso() {
        return curso;
    }

    public void cancelarMatri() {
        System.out.println("Matrícula será cancelada!");
    }

    @Override
    public String toString() {
        return "Aluno{" + "matri=" + matri + ", curso=" + curso + '}';
    }

    
    
    
}
