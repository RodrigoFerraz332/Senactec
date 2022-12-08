/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182120050
 */
public class Notas_escolares_vetor_matriz_menu {

    //declaração global
    static Scanner leia = new Scanner(System.in);//variaveis globais
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(".:Sistema de Notas:.");
        System.out.print("Informe o numero de alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas por aluno: ");
        nNotas = (int) leiaFloat();//casting=força a pegar o numero inteiro
        //Inicializar vetor e matriz de aluno e notas
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];//inicializando a variavel, (+1 cria eszpaço extra para média )
        int opM;//inicializa variavel
        do {//faça
            menu();//Cria o menu de opções
            opM = (int) leiaFloat();
            switch (opM) {//escolha do portugol
                case 1:
                    inserirAlunoNotas();//método
                    break;
                case 2:
                    imprimirAlunosNotas();//método
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuario!");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;
            }//fim swich
        } while (opM != 0);//enquanto
    }//fim main

    public static void menu() {//novo método menu
        System.out.println("1-Inserir Alunos e notas: ");//Imprime o menu
        System.out.println("2-Imprimir Alunos e notas: ");
        System.out.println("0-Sair: ");
        System.out.print("Digite aqui: ");
    }

    public static float leiaFloat() {//método
        try {//verifica erros
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {//da a mensagem de erro
            System.out.println("Erro:" + e.getMessage());
            System.out.print("Tente novamente: ");
            return leiaFloat();//recurção
        }
    }//fim do float

    private static void inserirAlunoNotas() {//Tratamento
        if (contAlunos < nAlunos) {
            System.out.println("Informe nome do aluno: ");
            alunos[contAlunos]=leia.next();
             for (int i = 0; i < nNotas; i++) {//para no portugol
                 System.out.print("Informe a"+(i+1)+"ªnota: ");
                 notas[contAlunos][i]=leiaFloat();
                 notas[contAlunos][nNotas]+=notas[contAlunos][i];               
            }//fim do for
             notas[contAlunos][nNotas]=notas[contAlunos][nNotas]/nNotas;//média
            contAlunos++;
        } else {
            System.out.println("Não é possivel digitar mais alunos: "
                    + "\nNúm.maximo de posições obtidos:");
        }
    }

    private static void imprimirAlunosNotas() {
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i]+"Sua média foi de %.2f",notas[i][nNotas]);
            if(notas[i][nNotas]>=7){
                System.out.println("Você aprovou");
            }else{
                System.out.println("Você não aprovou");
            }
        }
    }

}
