/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 182120050
 */
public class Dias_de_vida {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int idade, ano_atual, dias_de_vida;
        System.out.println("Digite sua idade:");
        idade = leia.nextInt();
        dias_de_vida = idade * 365;
        System.out.println("Voce esta vivo a:" + dias_de_vida+ "Dias de vida aproximadamente:");
        
        LocalDate dtnas, datual=LocalDate.now();
        
        System.out.println("dtAtual");
    }

}
