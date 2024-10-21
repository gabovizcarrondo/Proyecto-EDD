/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import EDD.Estacion;
import EDD.Grafo;
import EDD.Lista;
import javax.swing.JOptionPane;

/**
 *
 * @author Moises Liota
 */
public class Funcion {
    
    public Lista estacionesSinSucursal(Grafo grafo){
        if(!grafo.isEmpty()){
            Lista estacionesSinSucursal = new Lista();
            for (int i = 0; i < grafo.getEstaciones().getSize(); i++) {
                Estacion estacionActual = (Estacion) grafo.getEstaciones().getValor(i);
                if(!estacionActual.isSucursal()){
                    estacionesSinSucursal.insertFinale(estacionActual.getNombre());
                }
            }
            
            return estacionesSinSucursal;
        }
        
        return null;
    }
    
    public Lista estacionesConnSucursal(Grafo grafo){
        if(!grafo.isEmpty()){
            Lista estacionesConnSucursal = new Lista();
            for (int i = 0; i < grafo.getEstaciones().getSize(); i++) {
                Estacion estacionActual = (Estacion) grafo.getEstaciones().getValor(i);
                if(estacionActual.isSucursal()){
                    estacionesConnSucursal.insertFinale(estacionActual.getNombre());
                }
            }
            
            return estacionesConnSucursal;
        }
        
        return null;
    }
    
    public Lista verEstaciones(Grafo grafo){
        if(!grafo.isEmpty()){
            Lista estaciones= new Lista();
            for (int i = 0; i < grafo.getEstaciones().getSize(); i++) {
                Estacion estacionActual = (Estacion) grafo.getEstaciones().getValor(i);
                estaciones.insertFinale(estacionActual.getNombre());   
            }
            
            return estaciones;
        }
        
        return null;
    }
    
    public void agregarSucursal(Grafo grafo, String nombreEstacion){
        if(grafo.search(nombreEstacion) != null){
            Estacion estacion = grafo.search(nombreEstacion);
            estacion.setSucursal(true);
            JOptionPane.showMessageDialog(null, "Sucursal agregada con exito en: " + estacion.getNombre());
        }else{
            JOptionPane.showMessageDialog(null, "La sucursal no se pudo agregar porque \nel nombre de la estacion no se encuentra en el grafo");
        }
    }
    
    public void eliminarSucursal(Grafo grafo, String nombreEstacion){
        if(grafo.search(nombreEstacion) != null){
            Estacion estacion = grafo.search(nombreEstacion);
            estacion.setSucursal(false);
            JOptionPane.showMessageDialog(null, "Sucursal eliminada en: " + estacion.getNombre());
        }else{
            JOptionPane.showMessageDialog(null, "La sucursal no se pudo eliminada porque \nel nombre de la estacion no se encuentra en el grafo");
        }
    }
    
    
    public String mostrarEstaciones(Lista linea){
        if(!linea.isEmpty()){
            String estacionesStr = "";
            for (int i = 0; i < linea.getSize(); i++) {
                Estacion estacionActual = (Estacion) linea.getValor(i);
                estacionesStr += estacionActual.getNombre() + "\n";
            }
            
            return estacionesStr;
        }
        
        return "La linea aún no tiene estaciones";
    }
    
    public void agregarConexion(String nombreEstacionLinea, String nombreEstacionRed, Lista conexion){
        if(conexion.isEmpty()){
            conexion.insertFinale(nombreEstacionRed);
            conexion.insertFinale(nombreEstacionLinea);
        }else{
            conexion.destruir();
            conexion.insertFinale(nombreEstacionRed);
            conexion.insertFinale(nombreEstacionLinea);   
        }
        
        JOptionPane.showMessageDialog(null, "Conexion con la Red establecida");
    }
    
    public void añadirConexionesLinea(Lista linea){
        for (int i = 0; i < linea.getSize()-1; i++) {
            Estacion estacionActual = (Estacion) linea.getValor(i);
            Estacion estacionSiguiente = (Estacion) linea.getValor(i+1);
            
            estacionActual.getAdyacentes().insertFinale(estacionSiguiente);
            estacionSiguiente.getAdyacentes().insertFinale(estacionActual);
        }
    }
    
    public void agregarLinea(Grafo grafo, Lista linea){
        for (int i = 0; i < linea.getSize(); i++) {
            Estacion estacionActual = (Estacion) linea.getValor(i);
            grafo.insertStation2(estacionActual);
        }
    }
    
}
