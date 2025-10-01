/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;
import java.util.ArrayList;


public class BaseDatos {
    private String[][] productos;// para seleccionar
    private double[][] precios;
    private ArrayList<Producto> productoselec;
    private String[] lista1;// para seleccionar
    private String[] lista2;// para seleccionar
    private String[] lista3;// para seleccionar
    private ArrayList<ListaProducto> listasCompradas; //rellenar
    private String[] clientes;//se rellena
 



public BaseDatos(){
this.productos= new String[][]{
     //MUJERES
    
     {"1001", " POLO "," Dior " },
     {"1002", " polo "," Dior" },
     {"1003", " Camisa  "," Dior " },
     {"1004", " Camisa  "," Dior " },
     {"1005", " Chompa   "," Dior" },
     {"1006", " Chompa  "," Dior" },
    
     {"1007", " POLO "," Zara " },
     {"1008", " polo "," Zara" },
     {"1009", " Camisa  "," Zara " },
     {"1010", " Camisa  "," Zara " },
     {"1011", " Chompa   "," Zara" },
     {"1012", " Chompa  "," Zara " },
    

     // HOMBRES 
     {"1013", " POLO "," Dior " },
     {"1014", " polo "," Dior" },
     {"1015", " Camisa  "," Dior " },
     {"1016", " Camisa  "," Dior " },
     {"1017", " Chompa   "," Dior" },
     {"1018", " Chompa  "," Dior" },
    
     {"1019", " POLO "," Zara " },
     {"1020", " polo "," Zara" },
     {"1021", " Camisa  "," Zara " },
     {"1022", " Camisa  "," Zara " },
     {"1023", " Chompa   "," Zara" },
     {"1024", " Chompa  "," Zara " },
 
      };
    this.precios = new double[][]{
     //MUJERES 
     { 10, 20 },     // Dior , ZARA
     { 40, 50 },
     { 70, 80},
     { 100, 200},
     { 400, 500 },
     //HOBRES 
     {10, 20 },     // Dior , ZARA
     { 40, 50},
     { 70, 80},
     { 100, 200},
     { 400, 500},
        };
     // Listas 
        this.lista1 = new String[]{
            "Cuadernos A4 rayados - 5 unidades",
            "Lapices de grafito HB - 1 caja",
            "Borrador blanco - 2 unidades",
            "Tajador con depósito - 1 unidad",
            "Colores de madera - 1 estuche",
            "Regla de 30 cm - 1 unidad",
            "Boligrafos azul, rojo y negro - 1 de cada",
            "Tijera punta roma - 1 unidad",
            "Goma en barra - 2 unidades",
            "Cartuchera - 1 unidad"
        };
        this.lista2 = new String[]{
            "Cuadernos cuadriculados - 6 unidades",
            "Lapices 2B - 1 caja",
            "Borrador blanco - 1 unidad",
            "Sacapuntas doble - 1 unidad",
            "Marcadores de colores - 1 set",
            "Regla flexible - 1 unidad",
            "Boligrafos azul y rojo - 2 de cada",
            "Tijera escolar - 1 unidad",
            "Goma líquida - 1 frasco",
            "Cartuchera con divisiones - 1 unidad"
        };
        this.lista3 = new String[]{
            "Cuadernos universitarios - 4 unidades",
            "Lapiz y portaminas - 1 cada uno",
            "Borrador de tinta y grafito - 2 en 1",
            "Tajador metálico - 1 unidad",
            "Crayones - 1 caja",
            "Escuadra y transportador - 1 cada uno",
            "Boligrafos tricolor - 2 unidades",
            "Tijera profesional - 1 unidad",
            "Goma en barra grande - 1 unidad",
            "Cartuchera con cierre - 1 unidad"
        };
        
        //almacenar productos y listas
        productoselec = new ArrayList<>();
        listasCompradas = new ArrayList<>();
    }


    public String[][] getProductos() { return productos;}  
    public double[][] getPrecios() {return precios;}
    public String[] getLista1() {return lista1;}
    public String[] getLista2() {return lista2;}
    public String[] getLista3() {return lista3;}
    public ArrayList<Producto> getProductoselec() {return productoselec;}    
    public ArrayList<ListaProducto> getListasCompradas() {return listasCompradas;}
    
    
    
    public void agregarLista(ListaProducto lista) {
        listasCompradas.add(lista);
    }
    
   
    
    public String[] buscarProducto(int codigo, int cantidad){
        for (int i = 0; i < 6; i++) {
            if (productos[i][0].equals(String.valueOf(codigo))) {
                String marca = productos[i][2];
                int j = (marca.equals("Dior ")) ? 1 : 0;
                double precio = precios[i][j];
                return new String[]{
                    productos[i][1], 
                    productos[i][2], 
                    String.valueOf(precio)
                };
            }
        }
        return null;
    }
    
    

    public void mostrarMenuProductos() {
        System.out.println("========= LISTA DE PRODUCTOS =========");
        System.out.printf("%-8s %-25s %-20s %-10s%n", "CODIGO", "NOMBRE", "MARCA", "PRECIO");

        for (int i = 0; i < productos.length; i++) {
            String codigo = productos[i][0];
            String nombre = productos[i][1];
            String marca = productos[i][2];

            int j = marca.equals("Zara") ? 0 : 1;  // 0 = Faber, 1 = Standford
            double precio = precios[i % 6 ][j]; // caundo el residuo sea 1 sera la primera fila

            System.out.printf("%-8s %-25s %-20s S/ %.2f%n", codigo, nombre, marca, precio);
        }

    }        
        
    public void mostrarListaProducto(String[] lista) {
    for (int i = 0; i < lista.length; i++) {
        System.out.printf(" %2d. %s%n", i + 1, lista[i]);
    }
    }
}


   