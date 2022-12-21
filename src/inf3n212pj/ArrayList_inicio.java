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
public class ArrayList_inicio {

    /**
     * @param args the command line arguments
     *///Criar lista de compras
       //Deve ser feito com Arraylist
       //Deve poder add item a lista
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();//metodos de listas

        System.out.println("Array está vazio? " + nomes.isEmpty());
        System.out.println("Quantos registros" + nomes.size());

        nomes.add("Jair");
        System.out.println("Depois de add valor: ");
        System.out.println("Array está vazio? " + nomes.isEmpty());
        System.out.println("Quantos registros" + nomes.size());

        System.out.print("Digite um nome: ");
        nomes.add(leia.next());
        System.out.println("Depois de add valor: ");
        System.out.println("Quantos registros: " + nomes.size());//mostra a q
        System.out.println("Nomes: " + nomes.toString());

        nomes.add(0, "Filispino");
        System.out.println("Depois de add valor: ");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add(3, "Juvenal");
        System.out.println("Depois de add valor: ");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        System.out.println("Index de Jair: " + nomes.indexOf("Jair"));
        nomes.remove("Jair");//remove nomes 
        System.out.println("Resultado depois de remover Jair: ");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add("André");
        nomes.add("Silvado");
        nomes.add("Bagre");
        nomes.add("Godzilla");
        System.out.println("Depois de add valor: ");
        System.out.println("Quantos registros: " + nomes.size());//mostra total de casas usadas
        System.out.println("Nomes: " + nomes.toString());//mostra o conteudo da array
        
        Collections.sort(nomes);//Ordena em ordem alfabetica
        System.out.println("Array ordenado");
        System.out.println("Nomes" + nomes.toString());
        
        Collections.reverse(nomes);
        System.out.println("Array ordem inversa");
        System.out.println("Nomes" + nomes.toString());
        System.out.println("Impressão em lista: ");
        for (String nome : nomes) {// percorre o array list
            System.out.println(nome);//Imprime os valores
            
        }
        System.out.println("Digite nome a ser pesquisado");
        String pesqNome=leia.next();
        for (String nome : nomes) {
            if (nome.equals(pesqNome)) {
                System.out.println("Te encontrei");
                break;
                
            }
            
        }
        if (pesqNome(nomes,pesqNome)) {
            System.out.println("Te achei!!!!");
            }else{
            System.out.println("Snif, não te achei");
        }

    }//fim da main
    public static boolean pesqNome(ArrayList<String>ListaNomes, String nome){//método
        for (String ListaNome : ListaNomes) {//retorna verdadeiro ou falso=boolean
            if (ListaNomes.equals(nome)) {
                return true;
                
            }
            
        }
        return false;
    }

}
