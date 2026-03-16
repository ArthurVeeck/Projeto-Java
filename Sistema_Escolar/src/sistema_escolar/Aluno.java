package sistema_escolar;

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
    
    @Override
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }
}
