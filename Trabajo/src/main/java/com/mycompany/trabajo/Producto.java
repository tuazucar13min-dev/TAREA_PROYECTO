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
    private String talla;
    
    
   
    public Producto(int codigo, int cantidad, BaseDatos bd ){
        this.codigo = codigo;
        this.cantidad = cantidad;
         String[] datos = bd.buscarProducto(codigo, cantidad);
        if (datos != null) {
            this.nombreProducto = datos[0];
            this.marca = datos[1];
            this.precio = Double.parseDouble(datos[2]);
    }
        
    }
    
   
    public double calcularPrecio(){
    
     return precio;
    }
    public double totalProducto(){
      return precio * cantidad;
    }


    @Override
    public String toString(){
    
        String cadena = "producto: " + nombreProducto
                + " " + marca + talla + " "
                + codigo;
        return cadena;
    }

}


