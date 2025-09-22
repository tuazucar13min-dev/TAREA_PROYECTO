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
    
    
   
    public Producto(int codigo, int cantidad,String nombreProducto,String marca, double precio,String talla){
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombreProducto= nombreProducto;
        this.marca = marca;
        this.talla = talla;
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


