package sistema_escolar;

public class Turma{
    private int quantidadeAluno;
    private int numeroSala;
    
    public Turma(int quantidadeAluno, int numeroSala) {
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
    
    public void exibirPerfil(){
        System.out.println("Numero da sala: "+ getNumeroSala());
        System.out.println("Quantidade de aluno: " + getQuantidadeAluno());
    }
}
