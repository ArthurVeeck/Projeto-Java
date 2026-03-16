package sistema_escolar;

public class Turma extends Pessoa{
    private int quantidadeAluno;
    private int numeroSala;
    
    public Turma(String nome, String cpf, int idade, int quantidadeAluno, int numeroSala) {
        super(nome, cpf, idade);
        this.quantidadeAluno = quantidadeAluno;
        this.numeroSala = numeroSala;
    }

    public void setQuantidadeAluno(int quantidadeAluno){
        this.quantidadeAluno = quantidadeAluno;
    }
    
    public int getQuantidadeAluno(){
        return quantidadeAluno;
    }
    
    public void setNumeroSala(int numeroSala){
        this.numeroSala = numeroSala;
    }
    
    public int getNumeroSala(){
        return numeroSala;
    }
    
    @Override
    public void exibirPerfil(){
        System.out.println("Numero da sala: "+ getNumeroSala());
        System.out.println("Quantidade de aluno: " + getQuantidadeAluno());
    }
}
