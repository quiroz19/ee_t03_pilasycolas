/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasligadas;

/**
 *
 * @author Anita
 */
public class ColasLigadas {

    
    public static void main(String[] args) {
     colaLigadas b =new colaLigadas(6);
       b.agregar(1);
       b.eliminar();
     colaLigadas a= new colaLigadas(7);
        String l =a.leer("dato2.txt");
        String i=a.leer("dato3.txt");
        System.out.println(i);
        System.out.println(l);
    
}
}

