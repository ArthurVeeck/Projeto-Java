package sistema_escolar;

public class Disciplina extends Pessoa{
    private int cargaHoraria;
    
    public Disciplina(String nome, String cpf, int idade, int cargaHoraria) {
        super(nome, cpf, idade);
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    @Override
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Carga horaria em minutos: " + getCargaHoraria());
    }
}
