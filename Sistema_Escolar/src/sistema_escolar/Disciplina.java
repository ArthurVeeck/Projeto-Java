package sistema_escolar;

public class Disciplina{
    private int cargaHoraria;
    private String nome;
    
    public Disciplina(int cargaHoraria, String nome) {
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    
    public void exibirPerfil(){
        System.out.println("Nome da disciplina" + getNome());
        System.out.println("Carga horaria em minutos: " + getCargaHoraria());
    }
}
