/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana_6;

/**
 *
 * @author CIELO
 */
public class SEMANA_6 {

    private double precio;
    private double cantidad;
    private String nombreProducto;
    private String marca;
    private String talla;
    private String codigo;

    

   
    public class Producto{
    private int codigo;
    private int cantidad;
    public String nombreProducto;
    private String marca;
    private double precio;
    private String talla;
    
    
    //CONSTURCTOR    
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


