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
                    System.out.print("Nome: ");
                    String nomeA = ler.nextLine();

                    System.out.print("CPF: ");
                    String cpfA = ler.nextLine();

                    System.out.print("Matrícula: ");
                    String mat = ler.nextLine();

                    pessoas.add(new Aluno(nomeA, cpfA, mat));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeP = ler.nextLine();

                    System.out.print("CPF: ");
                    String cpfP = ler.nextLine();

                    System.out.print("Disciplina: ");
                    String disc = ler.nextLine();

                    pessoas.add(new Professor(nomeP, cpfP, disc));
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeF = ler.nextLine();

                    System.out.print("CPF: ");
                    String cpfF = ler.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = ler.nextLine();

                    pessoas.add(new Funcionario(nomeF, cpfF, cargo));
                    break;

                case 4:
                    System.out.print("Nome da turma: ");
                    String nomeT = ler.nextLine();

                    turmas.add(new Turma(nomeT));
                    System.out.println("Turma criada!");
                    break;

                case 5:
                    System.out.println("\n--- LISTA DE PESSOAS ---");
                    for (Pessoa p : pessoas) {
                        p.exibirPerfil(); // POLIMORFISMO AQUI
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        ler.close();
    }
}