package sistema_escolar;

public class Professor extends Pessoa{
     private String disciplina;

    public Professor(String nome, String cpf, int idade, String disciplina) {
        super(nome, cpf, idade);
        this.disciplina = disciplina;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public String getDisciplina(){
        return disciplina;
    }
    
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome() + "\n" + "CPF: "+ getCpf() + "\n" + "Idade: "+ getIdade() + 
                "\n" + "Disciplina: " + getDisciplina());
    }
}
