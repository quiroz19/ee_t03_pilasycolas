/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaligada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anita
 */
public class pilasLigadas{
    private Nodo tope;
    char [] pila;
    Integer topes;
    Integer tamaño;
    public pilasLigadas()
    {
        tope=null;
    }
    
    public boolean vacio()
    {
        return tope==null;
    }
    
    public boolean push(Object obj)
    {
        Nodo n=new Nodo(obj,tope);
        if(n==null)
            return false;
        tope=n;
        return true;
    }
    
     public Object pop(Object obj)
    {
        if(!vacio()){
            Object o=tope.getDato();
            tope=tope.getSig();
            return o;
        }
        return null;
        
    }
    
    public Object verTope(Object obj)
    {
        if(!vacio())
            return tope.getDato();
        return null;
    }
     public String leer(String nombre){
      
      File f;
      FileReader lectorArchivo;
      
      try{
          f=new File(nombre);
          lectorArchivo= new FileReader(f);
          BufferedReader br=new BufferedReader(lectorArchivo);
          String l="";
          String aux="";
          while(true){
              aux=br.readLine();
              if(aux!=null)
                  l=l+aux+"\n";
              else
                  break;
          }
          br.close();
          lectorArchivo.close();
          return l;
      }catch (IOException e){
          System.out.println("error:" + e.getMessage());
      }
      return null;
      
      
    
}
}
