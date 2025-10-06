/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author CIELO
 */
    public class Producto {
    private int codigo;
    private int cantidad;
    public String nombreProducto;
    private String marca;
    private double precio;
    
    
   
    public Producto(int codigo, int cantidad, BaseDatos bd ){
        this.codigo = codigo;
        this.cantidad = cantidad;
         String[] datos = bd.buscarProducto(codigo, cantidad);
        if (datos != null) {
            this.nombreProducto = datos[0];
            this.marca = datos[1];
            this.precio = Double.parseDouble(datos[2]);
    }
        else {
            this.nombreProducto = " Producto no encontrado";
            this.marca =" N/A";
            this.precio = 0.0;
        }
    }
    // Getters necearios para Factura 
   public int getCodigo(){ return codigo; }
   public int getCantidad(){ return cantidad; }
   public String getNombreProducto() { return nombreProducto;}
   public String getMarca(){ return marca;}
   public double getPrecio(){ return precio;}

    public double calcularPrecio(){
    
     return precio;
    }
    public double totalProducto(){
      return precio * cantidad;
    }


    @Override
    public String toString(){
    
    return String.format("Producto: %s %s - cod: %d - cant: %d - Precio: S/%.2f ", 
            nombreProducto, marca, codigo, cantidad, precio);
    }

}


