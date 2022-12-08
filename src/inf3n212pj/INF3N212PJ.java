/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;
//area de import equivalente inclua do portugol

import java.util.Scanner;

/**
 *
 * @author 182120050
 */
public class INF3N212PJ {//equivalente ao programado portugol
//equivalente a area de descrição de variavel global

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//
        // TODO code application logic here
        //equivalente a declaração de variavel local
        Scanner leia = new Scanner(System.in);//equivale ao leia do portugol
        float nota1, nota2, nota3, nota4, media;
        System.out.println("--Notas Escolares--");//equivalente ao escreva do portugol
        System.out.print("Digite a 1ª nota:");
        nota1 = leia.nextFloat();
        System.out.print("Digite a 2ªnota:");
        nota2 = leia.nextFloat();
        System.out.print("Digite a 3ª nota:");
        nota3 = leia.nextFloat();
        System.out.print("Digite a 4ª nota:");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("A média do aluno é:" + media);
        System.out.printf("Sua média foi de: %.2f" , media);
        if(media >=6){
         System.out.println("Aprovado:");
         
        }
        else{
        System.out.println("Reprovado");
    }
        
    }

}
