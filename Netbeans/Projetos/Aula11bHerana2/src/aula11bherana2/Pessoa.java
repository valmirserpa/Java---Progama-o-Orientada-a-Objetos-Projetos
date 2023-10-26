/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11bherana2;

/**
 *
 * @author valmir
 */
public abstract class Pessoa {
    /*Desta forma a classe pessoa não pode ser estancianda porque ela
    é abstrada*/

    private String nome;
    private int idade;
    private String sexo;
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    public final void fazerAniv() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Dados {" + "nome = " + nome + ", idade = " + idade + ", sexo = "
                + "" + sexo + '}';
    }

    
    
}
