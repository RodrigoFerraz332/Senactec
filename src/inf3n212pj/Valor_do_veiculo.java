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
public class Valor_do_veiculo {
//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
    //Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
    //escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leia = new Scanner(System.in);
           float preco_fabrica, preco_distribuidor, preco_consumidor;
           System.out.println("Digite o preço de fabrica:");
           preco_fabrica=leia.nextFloat();
           preco_distribuidor = (preco_fabrica*0.28f)+preco_fabrica;
           System.out.printf("O valor do distribuidor é:%.2f\n" ,preco_distribuidor);
           preco_consumidor=(preco_distribuidor*0.45f)+preco_distribuidor;
           System.out.printf("O valor do consumidor é:%.2f\n",preco_consumidor);
           
    }
    
}
