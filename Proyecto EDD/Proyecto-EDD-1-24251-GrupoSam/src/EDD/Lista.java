/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Moises Liota
 */
public class Lista {

    private Nodo pFirts;
    private int size;

    public Lista() {
        this.pFirts = null;
        this.size = 0;
    }

    public Nodo getpFirts() {
        return pFirts;
    }

    public void setpFirts(Nodo pFirts) {
        this.pFirts = pFirts;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return pFirts == null;
    }

    public void insertFinale(Object dato) {
        Nodo pNew = new Nodo(dato);
        if (this.isEmpty()) {
            this.setpFirts(pNew);
        } else {
            Nodo aux = this.pFirts;
            while (aux.getpNext() != null) {
                aux = aux.getpNext();
            }
            aux.setpNext(pNew);
        }
        size++;
    }

    public void deleteFinale() {
        if (!this.isEmpty()) {
            if (size == 1) {
                this.setpFirts(null);
            } else {
                Nodo aux = this.pFirts;

                while (aux.getpNext().getpNext() != null) {
                    aux = aux.getpNext();
                }
                aux.setpNext(null);
            }
            size--;
        }
    }

    public void deleteForReference(Object ref) {
        if (!this.isEmpty()) {
            if (size == 1) {
                if (this.pFirts.getDato() == ref) {
                    this.setpFirts(null);
                    size--;
                }
            } else {
                if (this.pFirts.getDato() == ref) {
                    this.setpFirts(this.pFirts.getpNext());
                    size--;
                } else {
                    Nodo aux = this.pFirts;
                    int count = 0;
                    while (aux.getpNext() != null) {
                        if (aux.getpNext().getDato() == ref) {
                            count++;
                            break;
                        }
                        aux = aux.getpNext();
                    }
                    if (count != 0) {
                        Nodo siguiente = aux.getpNext().getpNext();
                        aux.getpNext().setpNext(null);
                        aux.setpNext(siguiente);
                        size--;
                    } else {
                        if (aux.getDato() == ref) {
                            this.deleteFinale();
                            size--;
                        }
                    }

                }

            }
        }
    }

    public boolean search(Object dato) {
        if (!this.isEmpty()) {
            if (size == 1) {
                return this.pFirts.getDato() == dato;
            } else {
                Nodo aux = this.pFirts;
                while (aux != null) {
                    if (aux.getDato() == dato) {
                        return true;
                    }
                    aux = aux.getpNext();
                }
                return false;
            }
        }
        return false;
    }

    public void print() {
        if (!this.isEmpty()) {
            Nodo aux = this.pFirts;
            String listaStr = "";
            while (aux.getpNext() != null) {
                listaStr += aux.getDato() + "\n";
                aux = aux.getpNext();
            }

            listaStr += aux.getDato();

            JOptionPane.showMessageDialog(null, listaStr);

        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }
    }
    
    //Metodo para obtener el valor de un nodo en una determinada posición
    public Object getValor(int posicion) {

        if (posicion >= 0 && posicion < size) {

            if (posicion == 0) {
                return this.pFirts.getDato();
            } else {
                Nodo aux = this.pFirts;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getpNext();
                }
                return aux.getDato();
            }
        }
        return null;
    }
    
    public void destruir(){
        this.pFirts = null;
        this.size = 0;
    }

}
