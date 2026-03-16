
package com.mycompany.sistemaescolar;


public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, String cpf, int idade, int matricula, String curso) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome() + "\n" + "CPF: "+ getCpf() + "\n" + "Idade: "+ getIdade() + 
                "\n" + "Curso: "+ getCurso() + "\n" + "Matricula: "+ getMatricula());
    }
}
