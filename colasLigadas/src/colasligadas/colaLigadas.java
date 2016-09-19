/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasligadas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anita
 */
public class colaLigadas {
   int max;
   int fin;
   int frente;
   Object A[];
   public colaLigadas(int max){
       this.max = max;
       A = new Object[max];
       fin =-1;
       frente =0;
    }

    public boolean estaVacia(){
        return(fin==-1);
    }
    public boolean estaLlena(){
        return(fin == max-1);
    }
    public boolean agregar(Object o){
        if(!estaLlena()){
            fin++;
            A[fin]=0;
            return true;
        }
        return false;
    }
    public Object eliminar(){
        if(!estaVacia()){
            Object aux = A[frente];
            for(int i = 0;i<fin;i++)
            A[i]= A[i+1];
            fin--;
            return aux;
        }
        return null;
    }
    public Object VerFrente(){
        if(!estaVacia()){
            return A[frente];
        }
            return null;
        
    }
    public int getMax(){
        return max;
    }
    public int getFin(){
        return fin;
    }
    public int getFrente(){
        return frente;
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
    

