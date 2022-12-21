/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182120050
 */
public class Lista_de_compras {

    static Scanner leia = new Scanner(System.in);
    static ArrayList<String> Lista = new ArrayList<>();
    //Criar lista de compras
    //Deve ser feito com Arraylist
    //Deve poder add item a lista
    //Deve poder remover um item da lista
    //Deve poder imprimir a lista em ordem crescente
    //Deve poder sair do sistema de lista compras

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opM;

        do {//menu de opções
            System.out.println("1-Adicionar itens: ");
            System.out.println("2-Verificar itens: ");
            System.out.println("3-Remover itens:  ");
            System.out.println("0-Sair da lista: ");
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    verifica();
                    break;
                case 3:
                    remover();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    break;

            }

        } while (opM != 0);//fim do do

    }//Fim da main

    private static void adicionar() {
        Scanner leia = new Scanner(System.in);
        String add, item;//variaveis
        do {//laço de repetição para adicionar mais itens 
            System.out.println("Digite o item desejado: ");
            item = leia.nextLine();
            if (!verificaItem(item)) {//"!" é uma inversão do retorno dod método
                Lista.add(item);
                
            }else{
                System.out.println(item + " Esse item já existe! ");
            }//fim do else
            System.out.println("Deseja adicionar mais itens? S/N: ");
            add = leia.nextLine();
        } while (add.equalsIgnoreCase("s"));//fim do do

    }//fim do adicionar

    private static void verifica() {

        System.out.println("Lista: ");
        if(Lista.size()>0){
               Collections.sort(Lista);
        for (String nome : Lista) {// percorre o arraylist e mostra o resultado
            System.out.println(nome);
        }//fim do for
        }else{
            System.out.println("Lista vazia ");
        }
       
    }//fim da lista

    private static void remover() {
        String add, item = null, opM;
        Scanner leia = new Scanner(System.in);
        do{
            if(Lista.size()>0){
            System.out.println("digite um item a remover: ");
            Lista.remove(leia.nextLine());
                System.out.println("Item removido: ");
        }else{

       System.out.println(item +"Este item não exite na lista: ");
            
        }
            System.out.println("Deseja remover mais um item? S/N: ");
            add=leia.nextLine();
        }while(add.equalsIgnoreCase("s"));
        
       

    }//fim do remover

    private static void sair() {

    }

    private static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();

        } catch (Exception e) {
            System.out.print("Opção invalida, digite novamente: ");
            return leiaFloat();
        }

    }//fim do tratamento

    public static boolean verificaItem(String item) {
        for (String listaIten : Lista) {
            if (listaIten.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }
}
