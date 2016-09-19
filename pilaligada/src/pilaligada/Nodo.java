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
public class Nodo
{
    private Object dato;
    private Nodo sig;
    public Nodo(Object dato,Nodo sig)
    {
        this.dato=dato;
        this.sig=sig;
    }
    
    public void setDato(Object dato)
    {
        this.dato=dato;
    }
    
    public Object getDato()
    {
        return dato;
    }
    
    public void setSig(Nodo sig)
    {
        this.sig=sig;
    }
    
    public Nodo getSig()
    {
        return sig;
    }
}
