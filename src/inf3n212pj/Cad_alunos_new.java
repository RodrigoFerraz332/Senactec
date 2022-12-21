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
        do{
            menu();
            opM=leiaInt();
            switch(opM){
            case 1:
            cadAluno();
            break;
             case 2:
            break;
             case 3:
             imprimeAlunos();
            break;
             case 4:
            break;
             case 5:
            break;
             case 0:
             System.out.println("Aplicação encerrada");
            break;
        }
        }while(opM !=0);

    }//fim da main

    public static void menu() {
        System.out.println("#Sistema de Alinos#");
        System.out.println("1- Cadastrar aluno: ");
        System.out.println("2-Editar Aluno: ");
        System.out.println("3-Imprimir Aluno: ");
        System.out.println("4-Deletar Alunos: ");
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
        }

    }//fim cadAluno

    public static boolean verCPF(String cpf) {
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
        System.out.println("Lista de Alunos");
        for (Aluno aluno : alunos) {//Percorre o ArrayList
            System.out.println(aluno.toString());//puxa o String do model 

        }//fim do For
    }//fim do imprime
}
