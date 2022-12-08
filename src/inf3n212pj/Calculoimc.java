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
public class Calculoimc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leia = new Scanner(System.in);
         float peso, altura,IMC;
         String classificacao;
         System.out.println("--Calculo IMC--");
         System.out.println("Digite sua altura");
         altura = leia.nextFloat();
         System.out.println("Digite seu peso");
         peso = leia.nextFloat();
         IMC=peso/(altura*altura);
         System.out.printf("Seu IMC é: %.2f" , IMC);
         if(IMC<=18.5){
             classificacao="Abaixo do peso!";
             
         }else if(IMC<=24.9){
             classificacao="Peso ideal!";
         }else if(IMC <=29.9){
             classificacao="levemente acima do peso";
         }else if(IMC<=34.9){
             classificacao="Obesidade grau 1!";
         }else if(IMC<=39.9){
             classificacao="Obesidade grau 2!";
         }else{
             classificacao="Obesidade grau 3!";
         }
         System.out.println("\nSua classificação é:"+classificacao);
             
        
        
             
         
         
         
         
    }
    
}
