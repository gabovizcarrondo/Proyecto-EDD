/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author vizca
 */
public class Nodo {
    private Nodo Pnext;
    private Object dato;

    public Nodo( Object dato) {
        this.Pnext = null;
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getPnext() {
        return Pnext;
    }

    public void setPnext(Nodo Pnext) {
        this.Pnext = Pnext;
    }
    
}
