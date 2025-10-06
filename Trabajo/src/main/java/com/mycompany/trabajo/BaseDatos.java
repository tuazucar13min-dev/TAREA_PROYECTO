/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;
import java.util.ArrayList;
import java.util.HashMap; 

public class BaseDatos {
    private HashMap<Integer, String[]> productosMap ;// para seleccionar
    private HashMap<Integer, Double > preciosMap;
    private ArrayList<Producto> productoselec;
    private String[] lista1;// para seleccionar
    private String[] lista2;// para seleccionar
    private String[] lista3;// para seleccionar
    private ArrayList<ListaProducto> listasCompradas; //rellenar
    
  public void agregarLista(ListaProducto lista){
        listasCompradas.add(lista);
    }  

public void mostrarLista(String[] lista) {
    for (int i = 0; i < lista.length; i++) {
        System.out.printf(" %2d. %s%n", i + 1, lista[i]);
    }
}

public BaseDatos(){
    // Iniciañizar tablas hash 
    productosMap= new HashMap<>();
    preciosMap = new HashMap<>();

    // confirmar productos en tabla hash 
    inicializarProductos();
    

    // Listas de ropa 
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
          productoselec = new ArrayList<>();
        listasCompradas = new ArrayList<>();
    }
    
    private void inicializarProductos(){
    // MUJERES DIOR 
    productosMap.put( 1001, new String[]{ "POLO"," Dior "});
    preciosMap.put(1001, 10.0);
    productosMap.put( 1002, new String[]{ "POLO"," Dior "});
    preciosMap.put(1002, 10.0);
    productosMap.put( 1003, new String[]{ "C"," Dior "});
    preciosMap.put(1003, 10.0);
    productosMap.put( 1004, new String[]{ "C"," Dior "});
    preciosMap.put(1004, 10.0);
    productosMap.put( 1005, new String[]{ "CHO"," Dior "});
    preciosMap.put(1005, 10.0);
    productosMap.put( 1006, new String[]{ "CHO"," Dior "});
    preciosMap.put(1006, 10.0);
     
    // MUJERES ZARA
    productosMap.put( 1007, new String[]{ "POLO"," Zara "});
    preciosMap.put(1007, 10.0);
    productosMap.put( 1008, new String[]{ "POLO"," Zara "});
    preciosMap.put(1008, 10.0);
    productosMap.put( 1009, new String[]{ "C"," Zara "});
    preciosMap.put(1009, 10.0);
    productosMap.put( 1010, new String[]{ "C"," Zara "});
    preciosMap.put(1010, 10.0);
    productosMap.put( 1011, new String[]{ "CHO"," Zara "});
    preciosMap.put(1011, 10.0);
    productosMap.put( 1012, new String[]{ "CHO"," Zara "});
    preciosMap.put(1012, 10.0);

     // HOMBRES DIOR 
    productosMap.put( 1013, new String[]{ "POLO"," Dior"});
    preciosMap.put(1013, 10.0);
    productosMap.put( 1014, new String[]{ "POLO"," Dior "});
    preciosMap.put(1014, 10.0);
    productosMap.put( 1015, new String[]{ "C"," Dior "});
    preciosMap.put(1015, 10.0);
    productosMap.put( 1016, new String[]{ "C"," Dior "});
    preciosMap.put(1016, 10.0);
    productosMap.put( 1017, new String[]{ "CHO"," Dior "});
    preciosMap.put(1017, 10.0);
    productosMap.put( 1018, new String[]{ "CHO"," Dior "});
    preciosMap.put(1018, 10.0);
     
    // HOMBRES ZARA
    productosMap.put( 1019, new String[]{ "POLO"," Zara "});
    preciosMap.put(1019, 10.0);
    productosMap.put( 1020, new String[]{ "POLO"," Zara "});
    preciosMap.put(1020, 10.0);
    productosMap.put( 1021, new String[]{ "C"," Zara "});
    preciosMap.put(1021, 10.0);
    productosMap.put( 1022, new String[]{ "C"," Zara "});
    preciosMap.put(1022, 10.0);
    productosMap.put( 1023, new String[]{ "CHO"," Zara "});
    preciosMap.put(1023, 10.0);
    productosMap.put( 1024, new String[]{ "CHO"," Zara "});
    preciosMap.put(1024, 10.0);
      
}

    public String[] buscarProducto(int codigo, int cantidad){
      
    if (productosMap.containsKey(codigo) && preciosMap.containsKey(codigo)){
        String[]datosProducto = productosMap.get(codigo);
        String nombre = datosProducto[0];
        String marca = datosProducto[1];
        double precio = preciosMap.get(codigo);
 
                
        return new String[]{ datosProducto[0],datosProducto[1], String.valueOf(precio)};
        }
        return null;
        }
       
    
    

    public void mostrarMenuProductos() {
        System.out.println("========= LISTA DE PRODUCTOS =========");
        System.out.printf("%-8s %-25s %-20s %-10s%n", "CODIGO", "NOMBRE", "MARCA", "PRECIO");

        for (HashMap.Entry<Integer, String[]> entry : productosMap.entrySet()){ {
            int codigo= entry.getKey();
            String[]datos = entry.getValue();
            String nombre = datos [0];
            String marca = datos [1];
            double precio = preciosMap.get(codigo);

           

            System.out.printf("%-8s %-25s %-20s S/ %.2f%n", codigo, nombre, marca, precio);
        }

    }        
    
    
  
    }
    // Getters 
    public HashMap<Integer, String[]> getProductosMap(){ return productosMap;}
    public HashMap<Integer,Double> getPreciosMap() { return preciosMap; }
    public String[]getLista1() { return lista1; }
    public String[]getLista2() { return lista2; }
    public String[]getLista3() { return lista3; }
    public ArrayList<Producto> getProductoselec(){ return productoselec;}
    public ArrayList<ListaProducto> getListaCompradas(){ return listasCompradas;}

  
  
}


  


   