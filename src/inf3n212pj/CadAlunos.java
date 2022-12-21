/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import MODEL.Aluno;
import java.util.Scanner;

/**
 *
 * @author 182120050
 */
public class CadAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno juca = new Aluno(123, "321", "Juca Bala", "masculino", 55, "5199999999", true);
        Aluno harry = new Aluno(555, "157", "Harry Potter", "masculino", 18, "5186542312", false);
        System.out.println("Aluno: " + juca.toString());//imprime todos os itens
        System.out.println("Nome: " + juca.getNome());//imprime so o nome
        juca.setNome("Juca Bala das Condongas");
        System.out.println("Aluno: " + juca.toString());
        System.out.println("Nome: " + juca.getNome());

        System.out.println("Aluno: " + harry.toString());//imprime todos os itens
        System.out.println("Nome: " + harry.getNome());//imprime so o nome
        harry.setNome("Harry Potter: ");
        System.out.println("Aluno: " + harry.toString());
        System.out.println("Nome: " + harry.getNome());

        //criar novo aluno utilizando a leitura do console pelo Scanner
        Scanner leia = new Scanner(System.in);
        int matricula;
        String cpf;
        String nome;
        String sexo;
        int idade;
        String telefone;
        boolean status;
        
        System.out.print("Digite a matricula: ");
        matricula=leia.nextInt();
        leia.nextLine();
        System.out.print("Digite o CPF: ");
        cpf=leia.nextLine();
        System.out.print("Digite o Nome: ");
        nome=leia.nextLine();
        System.out.print("Digite o sexo(M/F): ");
        sexo=leia.nextLine();
        System.out.print("Digite a idade: ");
        idade=leia.nextInt();
        leia.nextLine();
        System.out.print("Digite o telefone: ");
        telefone=leia.nextLine();
        System.out.println("Aluno ativo? Digite: 1 Sim | 2 Não: ");
        int valorStatus=leia.nextInt();
        if(valorStatus==1){//teste para ver se o aluno está ativo
            status=true;
            
        }else{
            status=false;
        }
        Aluno aluno1= new Aluno(matricula, cpf, nome, sexo, idade, telefone, status);
        System.out.println("Aluno 1: "+ aluno1.toString());
        
        
    }//fim da main

}
