/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212pj;

import MODEL.Carro;
import MODEL.Pessoa;

/**
 *
 * @author 182120050
 */
public class PessoaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1= new Pessoa();
        p1.setNome("Rodrigo");
        p1.setCpf("123");
        p1.setCelular("519999999");
        
        Pessoa p2=new Pessoa("Carlos","321","51888888");
        Carro car1 = new Carro();
        car1.setPlaca("ABC123");
        car1.setMarca("Renault");
        car1.setModelo("Sandeiro");
        car1.setAnoMod(2015);
        car1.setProprietario(p2);
        car1.setAnoFab(2014);
        
        Carro car2 = new Carro("ABC555","Fiat","Uno",2012,2011,p1);
        Carro car3=new Carro("kkk789","REnault","Megane",2015,2014,p2);
        System.out.println("Pessoa");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("\nCarros");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
      
        
               
        
        
    }
    
}
