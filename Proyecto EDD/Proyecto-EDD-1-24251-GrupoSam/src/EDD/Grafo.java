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
public class Grafo {

    private Lista estaciones;

    public Grafo() {
        this.estaciones = new Lista();
    }

    public Lista getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(Lista estaciones) {
        this.estaciones = estaciones;
    }

    public boolean isEmpty() {
        return this.estaciones.isEmpty();
    }

    public Estacion search(String nombreEstacion) {
        if (!this.isEmpty()) {
            Nodo aux = this.estaciones.getpFirts();
            while (aux != null) {
                Estacion estacionActual = (Estacion) aux.getDato();
                if (estacionActual.getNombre().equalsIgnoreCase(nombreEstacion)) {
                    return estacionActual;
                }
                aux = aux.getpNext();
            }
            return null;
        }
        return null;
    }

    public void insertStation(String nombreEstacion) {
        if (this.search(nombreEstacion) == null) {
            Estacion estacion = new Estacion(nombreEstacion);
            estacion.setNumVertice(this.estaciones.getSize());
            this.estaciones.insertFinale(estacion);
        } else {
            JOptionPane.showMessageDialog(null, "La estacion ya existe.");
        }
    }
    
    public void insertStation2(Estacion estacion) {
        if (this.search(estacion.getNombre()) == null) {
            estacion.setNumVertice(this.estaciones.getSize());
            this.estaciones.insertFinale(estacion);
        } else {
            JOptionPane.showMessageDialog(null, "La estacion ya existe.");
        }
    }

    //Tiene un pequeño bug
    public void addConnection(String nombreEstacion1, String nombreEstacion2) {
        if (this.search(nombreEstacion1) != null && this.search(nombreEstacion2) != null) {
            Estacion estacionInicio = search(nombreEstacion1);
            Estacion estacionFinal = search(nombreEstacion2);

            estacionInicio.getAdyacentes().insertFinale(estacionFinal);
            estacionFinal.getAdyacentes().insertFinale(estacionInicio);

            JOptionPane.showMessageDialog(null, "Conexion agregada con exito.");
        } else {
            if (this.search(nombreEstacion1) == null && this.search(nombreEstacion2) != null) {
                JOptionPane.showMessageDialog(null, "La estacion de inicio no existe.");
            } else if (this.search(nombreEstacion1) != null && this.search(nombreEstacion2) == null) {
                JOptionPane.showMessageDialog(null, "La estacion de llegada no existe.");
            } else {
                JOptionPane.showMessageDialog(null, "Ninguna de las estaciones existe.");
            }
        }
    }

    public void deleteConnection(String nombreEstacion1, String nombreEstacion2) {
        if (this.search(nombreEstacion1) != null && this.search(nombreEstacion2) != null) {
            Estacion estacionInicio = search(nombreEstacion1);
            Estacion estacionFinal = search(nombreEstacion2);

            if (estacionInicio.getAdyacentes().search(estacionFinal)) {
                estacionInicio.getAdyacentes().deleteForReference(estacionFinal);
                estacionFinal.getAdyacentes().deleteForReference(estacionInicio);

                JOptionPane.showMessageDialog(null, "Conexion eliminada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No son adyacentes.");
            }

        } else {
            if (this.search(nombreEstacion1) == null && this.search(nombreEstacion2) != null) {
                JOptionPane.showMessageDialog(null, "La estacion de inicio no existe.");
            } else if (this.search(nombreEstacion1) != null && this.search(nombreEstacion2) == null) {
                JOptionPane.showMessageDialog(null, "La estacion de llegada no existe.");
            } else {
                JOptionPane.showMessageDialog(null, "Ninguna de las estaciones existe.");
            }
        }
    }

    public void getAdjacent(String nombreEstacion) {
        if (this.search(nombreEstacion) != null) {
            Estacion estacion = this.search(nombreEstacion);
            JOptionPane.showMessageDialog(null, estacion.printAdy());
        } else {
            JOptionPane.showMessageDialog(null, "La estacion ya existe.");
        }
    }

    public boolean connected(String nombreEstacion1, String nombreEstacion2) {
        if (this.search(nombreEstacion1) != null && this.search(nombreEstacion2) != null) {
            Estacion estacionInicio = search(nombreEstacion1);
            Estacion estacionFinal = search(nombreEstacion2);

            if (estacionInicio.getAdyacentes().search(estacionFinal)) {
                JOptionPane.showMessageDialog(null, "Si estan conectadas");
                return true;
            } else {
                
                JOptionPane.showMessageDialog(null, "No son adyacentes.");
                return false;
            }

        } else {
            if (this.search(nombreEstacion1) == null && this.search(nombreEstacion2) != null) {
                JOptionPane.showMessageDialog(null, "La estacion de inicio no existe.");
            } else if (this.search(nombreEstacion1) != null && this.search(nombreEstacion2) == null) {
                JOptionPane.showMessageDialog(null, "La estacion de llegada no existe.");
            } else {
                JOptionPane.showMessageDialog(null, "Ninguna de las estaciones existe.");
            }

            return false;
        }
    }
    
    public void destruir(){
        this.estaciones = new Lista();
    }

    @Override
    public String toString() {
        if (!this.isEmpty()) {
            String estacionesStr = "";
            Nodo aux = this.estaciones.getpFirts();
            while (aux.getpNext() != null) {
                Estacion estacionActual = (Estacion) aux.getDato();
                estacionesStr += estacionActual.getNombre() + " ---> " + estacionActual.printAdy() + "\n";
                aux = aux.getpNext();
            }
            Estacion estacionActual = (Estacion) aux.getDato();
            estacionesStr += estacionActual.getNombre()  + " ---> " + estacionActual.printAdy();
            return estacionesStr;
        } else {
            return "Grafo vacion";
        }
    }

}
