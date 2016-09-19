/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaligada;

/**
 *
 * @author Anita
 */
public class Pilaligada {

    public static void main(String[] args) {
        
       pilasLigadas b =new pilasLigadas();
        b.pop(1);
        b.push(0);
        b.verTope(2);
        pilasLigadas a= new pilasLigadas();
        
        String l =a.leer("datos.txt");
        System.out.println(l);
        
        
    }

    
    
}

