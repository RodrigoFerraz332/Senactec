/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import MODEL.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 182120050
 */
public class Cad_alunos_new {

    static ArrayList<Aluno> alunos = new ArrayList<>();//criar um ArrayLIst chamada Alunos, e importa do model a classe "Aluno".
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        do {
            menu();
            opM = leiaInt();
            switch (opM) {
                case 1:
                    cadAluno();
                    break;
                case 2:
                    atualizarAluno();
                    break;
                case 3:
                    imprimeAlunos();
                    break;
                case 4:
                    deletarAluno();
                    break;
                case 5:
                    imprimeAlunosAtivos();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada");
                    break;
            }
        } while (opM != 0);

    }//fim da main

    public static void menu() {
        System.out.println("#Sistema de Alunos#");
        System.out.println("1- Cadastrar aluno: ");
        System.out.println("2-Editar Aluno: ");
        System.out.println("3-Imprimir Aluno: ");
        System.out.println("4-Deletar/Inativar Alunos: ");
        System.out.println("5-Imprimir Alunos Ativos: ");
        System.out.println("0-Sair: ");
        System.out.println("Digite aqui: ");

    }//fim menu

    public static void cadAluno() {
        System.out.println("Cadastro Alunos");
        System.out.println("Digite o CPF do Aluno: ");
        String cpf = leia.nextLine();
        if (!verCPF(cpf)) {//"!"serve para negar o retorno do verCPF.
            System.out.println("Digite a matricula: ");
            int matricula = leiaInt();
            System.out.println("Digite o nome do Aluno");
            String nome = leia.nextLine();
            System.out.println("Informe o Sexo: ");
            String sexo = leia.nextLine();
            System.out.println("Digite a Idade do Aluno: ");
            int idade = leia.nextInt();
            System.out.println("informe o telefone: ");
            String telefone = leia.nextLine();
            boolean status = true;
            Aluno a = new Aluno(matricula, cpf, nome, sexo, idade, telefone, status);
            alunos.add(a);

        } else {
            System.out.println(cpf + "Já existe!");
            if (verCPF(cpf)) {
                System.out.println("Quer ativar esse aluno, digite 1 ");
                int op = leiaInt();
                if (op == 1) {
                    getAluno(cpf).setStatus(true);
                    System.out.println("Aluno" + getAluno(cpf).getNome() + "ativado: ");
                }
                
                
            }
        }

    }//fim cadAluno

    public static boolean verCPF(String cpf) {//verifica o cpf
        for (Aluno aluno : alunos) {//for para percorrer o ArrayList
            if (aluno.getCpf().equals(cpf)) {
                return true;

            }//fim do if
        }//fim do for
        return false;
    }//fim verCPF

    public static int leiaInt() {//metodo de tratamento
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextInt();
        } catch (Exception e) {
            System.out.print("Valor inserido inválido, tente novamente: ");
            return leiaInt();
        }//fim do catch
    }//fim do leia int

    public static void imprimeAlunos() {
        System.out.print("Lista de Alunos");
        if (alunos.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            for (Aluno aluno : alunos) {//Percorre o ArrayList
                System.out.println(aluno.toString());//puxa o String do model 
            }
        }
    }//fim do imprime

    public static Aluno getAluno(String cpf) {

        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        return null;
    }//fim do getaluno

    public static void deletarAluno() {
        System.out.println("Deletar/Inativar Aluno");
        System.out.println("Informe o CPF: ");
        String cpf = leia.nextLine();
        if (verCPF(cpf)) {
            System.out.println("1-Deletar|n2-Inativar: ");
            System.out.println("Digite: ");
            int op = leiaInt();
            if (op == 1) {
                alunos.remove(getAluno(cpf));
                System.out.println("aluno com cpf" + cpf + "deletado com sucesso!");
            } else if (op == 2) {
                getAluno(cpf).setStatus(false);
                System.out.println("Aluno" + getAluno(cpf).getNome() + "inativado: ");
            }

        } else {
            System.out.println("Aluno não encontrado!");
        }

    }//fim do deletar

    public static void imprimeAlunosAtivos() {
        System.out.print("Lista de Alunos");
        if (alunos.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            for (Aluno aluno : alunos) {//Percorre o ArrayList
                if (aluno.isStatus()) {
                    System.out.println(aluno.toString());//puxa o String do model 
                }
            }
        }
    }//fim do imprime alunos ativos
    public static void atualizarAluno(){
        System.out.println("Atualizar aluno");
        System.out.println("Informe cpf do aluno: ");
        String cpf=leia.nextLine();
        if(verCPF(cpf)){
            Aluno alunoEditar=getAluno(cpf);
            System.out.println("Dados do Aluno: ");
            System.out.println(alunoEditar.toString());
            System.out.println("Informe o sexo: ");
            alunoEditar.setSexo(leia.nextLine());
            System.out.println("Informe a idade: ");
            alunoEditar.setIdade(leia.nextInt());
            System.out.println("Informe o telefone: ");
            alunoEditar.setTelefone(leia.nextLine());
            System.out.println("Dados atualizados: \n"+alunoEditar.toString());
            
           
        }else{
            System.out.println("Aluno não encontrado: ");
        }
    }
}
