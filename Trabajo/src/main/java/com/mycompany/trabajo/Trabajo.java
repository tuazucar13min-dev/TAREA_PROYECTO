/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;


import java.util.Scanner;
import com.mycompany.trabajo.Trabajo;
import com.mycompany.trabajo.Producto;
import com.mycompany.trabajo.ListaProducto;
import com.mycompany.trabajo.Factura;
import com.mycompany.trabajo.BaseDatos;


/**
 *
 * @author CIELO
 */
public class Trabajo {
    public static Producto IngresaProductos(){//Este metodo permite mostrar la pantalla de productos y elegir
        int codigo, cantidad;
        Scanner dato = new Scanner(System.in);
        BaseDatos bd = new BaseDatos();
        bd.mostrarMenuProductos();
        System.out.println("Seleccione el producto ingresando su codigo");
        try {
        codigo = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        -----------------
        Producto objcomprado = new Producto(codigo, cantidad, bd);
        return objcomprado;
    }
    public static ListaProducto IngresarListas(){
        BaseDatos bd = new BaseDatos();
        Scanner dato = new Scanner(System.in);
        int lista, cantidad;
        double precio;
        System.out.println("Lista de utiles escolares del Colegio 1:  S/.245.50");
        bd.mostrarLista(bd.getLista1());
        System.out.println("\nLista de utiles escolares del Colegio 2:  S/.350.20");
        bd.mostrarLista(bd.getLista2());
        System.out.println("\nLista de utiles escolares del Colegio 3:  S/.180");
        bd.mostrarLista(bd.getLista3());
     
        System.out.println("Seleccione el numero de lista");
        try { 
        lista = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        -------------
        switch (lista) {
            case 1: precio = 245.50;            
                break;
            case 2: precio = 350.20;            
                break;
            case 3: precio = 180;            
                break;
            default:
                throw new AssertionError();
        }
        ListaProducto objlista = new ListaProducto (lista, cantidad, precio);
        return objlista;
    }
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int comando = 0;
        boolean Selecval = true;
                
        do {
            
            System.out.println("Buenos dias, Porfavor seleccione el tipo de compra");
            System.out.println("(1) Compra de productos especificos");
            System.out.println("(2) Compra de Lista Escolar");
            
            
            try { 
                comando = integer.parseInt(dato.nextLine());
            if (comando == 1) {
                System.out.println("Ingresaste a seccion de productos"); break;
            }else{
                if (comando == 2) {
                    System.out.println("Ingresaste a la seccion Listas"); break;
                }
                else 
                { System.out.println ( " Caomando no valido. Intente nuevamente ");
                }
            }
            }catch ( Exception ex ){
                  System.out.println (" Error: entrada no válida. Por favor, ingresa un numero 1 0 2");  
                  dato.nextLine();
            continue;     
            }
        } while (Selecval);
        
        String continuar = "";
        BaseDatos bd = new BaseDatos();
        Factura factura = new Factura(bd);
        if (comando ==1) {
            do {
                
                Producto objcomprado = IngresaProductos();
                objcomprado.calcularPrecio();
                objcomprado.totalProducto();
                System.out.println(objcomprado.toString() + " " + objcomprado.totalProducto());
                
                //se agrega el objeto a la lista para guardarlo para factura
     
                System.out.println("Desea continaur? si/no");
                -----------------------------
                continuar = dato.next();
                -----------------------
            } while (continuar.equalsIgnoreCase("si"));
            factura.imprimirFactura();
        }else if (comando == 2) {
            do {                
                ListaProducto objlista = IngresarListas();
                
                objlista.getPrecio();
                objlista.Calcularsubtotal();
                bd.agregarLista(objlista);
                System.out.println("Desea continaur? si/no");
                continuar = dato.next();
            } while (continuar.equalsIgnoreCase("si"));
            
            factura.imprimirFacturaListas(); // Esto imprime la factura de listas escolares

        }
    }
    
    
}
