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
public class Notas_escolares_vetor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iContnotas;
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o total de de notas do aluno: ");
        iContnotas = leia.nextInt();
        float notas[] = new float[iContnotas+1];
        System.out.println(iContnotas);

        System.out.println("Notas escolares: ");
        for (int i = 1; i < iContnotas+1 ; i++) {//para do portugol, comece a contar do 0
            //Laço "do" para garantir que a nota esteja entre 0 e 10
            do{//faça enquanto do portugol
                System.out.print("Digite a "+i+"ª nota");
            
            notas[i] = leiaFloat();
            if (validaNota(notas[i])){// "||" pipe é or "&&" é and
                System.out.println("Nota inválida: ");
            }
            }
            while (validaNota(notas[i]));//fim do do
            notas[0] += notas[i];

        }//fim do for
        notas[0] = notas[0] / iContnotas;
        System.out.printf("A média é:%.2f " ,notas[0]);
        if (notas[0] >= 6)
        {
            System.out.println("Aprovado: ");
        }else{
            System.out.println("Reprovado, pague o senac: ");
        }
    }//fim da main
    public static boolean validaNota(float nota){
        
        return nota<0 || nota>10;
    }//fim do valida nota
    public static float leiaFloat(){
        try{
        Scanner leia=new Scanner(System .in);
        return leia.nextFloat();
        }catch(Exception e){
            System.out.println("Erro:"+e.getMessage());
            System.out.print("Tente novamente: ");
            return leiaFloat();
        }
    }//fim do float
    
}
