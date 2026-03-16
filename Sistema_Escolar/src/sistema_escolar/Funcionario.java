package sistema_escolar;

public class Funcionario extends Pessoa{
    private double salario;
    private int cargaHoraria;
    
    public Funcionario(String nome, String cpf, int idade, double salario, int cargaHoraria) {
        super(nome, cpf, idade);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
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
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Carga horaria em minutos: " + getCargaHoraria());
        System.out.println("Salario: " + getSalario());
    }   
}
