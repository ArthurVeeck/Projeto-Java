package sistema_escolar;

public class Aluno extends Pessoa{
    private int matricula;
    

    public Aluno(String nome, String cpf, int idade, int matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;   
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    @Override
    public void exibirPerfil(){
        System.out.println("Nome do aluno: "+ getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
    }
}
