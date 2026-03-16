package sistema_escolar;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }  
    
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
    }
}
