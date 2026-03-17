package sistema_escolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_Escolar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- SISTEMA ESCOLAR ---");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Cadastrar professor");
            System.out.println("3. Cadastrar funcionário");
            System.out.println("4. Criar turma");
            System.out.println("5. Listar pessoas");
            System.out.println("6. Sair");

            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeA = ler.nextLine();

                    System.out.print("CPF: ");
                    String cpfA = ler.nextLine();
                    
                    System.out.println("Idade: ");
                    int idadeA = ler.nextInt();
                    
                    System.out.print("Matrícula: ");
                    int matA = ler.nextInt();
                               
                    pessoas.add(new Aluno(nomeA, cpfA, idadeA, matA));
                    break;

                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeP = ler.nextLine();

                    System.out.print("CPF: ");
                    String cpfP = ler.nextLine();
                    
                    System.out.println("Idade: ");
                    int idadeP = ler.nextInt();

                    System.out.print("Carga Horaria em minutos: ");
                    int cargaHorariaP = ler.nextInt();
                    
                    System.out.println("Salario: ");
                    double salarioP = ler.nextDouble();
                    
                    pessoas.add(new Professor(nomeP, cpfP, idadeP, cargaHorariaP, salarioP));
                    break;

                case 3:
                    System.out.print("Nome do funcionario: ");
                    String nomeF = ler.nextLine();

                    System.out.print("CPF: ");
                    String cpfF = ler.nextLine();
                    
                    System.out.println("Idade: ");
                    int IdadeF = ler.nextInt();

                    System.out.print("Carga Horaria em minutos: ");
                    int cargaHorariaF = ler.nextInt();
                    
                    System.out.println("Salario: ");
                    double salarioF = ler.nextDouble();
                    
                    pessoas.add(new Funcionario(nomeF, cpfF, IdadeF, salarioF, cargaHorariaF));
                    break;

                case 4:
                    System.out.print("Numero da turma: ");
                    int numeroT = ler.nextInt();
                    
                    System.out.println("Quantidade de aluno: ");
                    int QuantidadeT = ler.nextInt();

                    turmas.add(new Turma(QuantidadeT, numeroT));
                    System.out.println("Turma criada!");              
                    break;

                case 5:
                    System.out.println("\n--- LISTA DE PESSOAS ---");
                    for (Pessoa p : pessoas) {
                        p.exibirPerfil(); 
                        System.out.println("");
                    }
                    break;

                case 6:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != 6);
        ler.close();
    }
}