/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11bherana2;

/**
 *
 * @author valmir
 */
public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno "+ this.getNome());
    }

}
