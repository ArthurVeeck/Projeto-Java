package sistema_escolar;

public class Professor extends Pessoa{
     private int cargaHoraria;
     private double salario; 

    public Professor(String nome, String cpf, int idade, int cargaHoraria, double salario) {
        super(nome, cpf, idade);
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    @Override
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Carga horaria em minutos: " + getCargaHoraria());
        System.out.println("Salario: " + getSalario());
    } 
}
