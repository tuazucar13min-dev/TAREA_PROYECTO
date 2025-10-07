/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ropa_anime;

/**
 *
 * @author CIELO
 */
public class ListaROPA_ANIME {

    private int lista;
    private int cantidad;
    private double precio;
    
public ListaROPA_ANIME (int lista, int cantidad, double precio) {
        this.lista = lista;
        this.cantidad = cantidad;
        this.precio = precio;
}
 public int getLista() {return lista;}
    public void setLista(int lista) { this.lista = lista; }
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public double getPrecio() { return precio;}
    public void setPrecio(double precio) { this.precio = precio;}
    
    public double Calcularsubtotal(){
        return cantidad*precio;
    }
     @Override
    public String toString() {
        String nombreLista;
        switch (lista) {
            case 1:
                nombreLista = "Lista anime  1";
                break;
            case 2:
                nombreLista = "Lista anime  2";
                break;
            case 3:
                nombreLista = "Lista anime  3";
                break;
            default:
                nombreLista = "Lista desconocida";
        }

        return "\nDETALLE DE COMPRA DE LISTAS " +
               "\nLista seleccionada: " + nombreLista +
               "\nCantidad de listas: " + cantidad +
               "\nPrecio por lista: S/" + String.format("%.2f", precio) +
               "\nSubtotal: S/" + String.format("%.2f", Calcularsubtotal());
    }   
}