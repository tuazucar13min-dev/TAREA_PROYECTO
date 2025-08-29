/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

public class BaseDatos {
private String [][]producto;
private double [][] precio;

public BaseDatos(){
this.producto= new String[][]{
     //MUJERES
     {"1001", " POLO "," marca A " },
     {"1002", " polo "," marca A" },
     {"1003", " polo "," marca  B" },
     {"1004", " polo "," marca B" },
     {"1005", " polo "," marca A" },
     
     {"1006", " CAMISA "," marca B" },
     {"1007", " Camisa "," marca B" },
     {"1008", " Camisa "," marca A" },
     {"1009", " Camisa "," marca A" },
     {"1010", " Camisa "," marca B" },
     
     {"1011", " CHOMPAS "," marca A" },
     {"1012", " chompas "," marca A" },
     {"1013", " chompas "," marca B" },
     {"1014", " chompas "," marca B" },
     {"1015", " chompas "," marca A" },
     // HOMBRES 
     {"1016", " POLO "," marca A " },
     {"1017", " polo "," marca A" },
     {"1018", " polo "," marca  B" },
     {"1019", " polo "," marca B" },
     {"1020", " polo "," marca A" },
     
     {"1021", " CAMISA "," marca B" },
     {"1022", " Camisa "," marca B" },
     {"1023", " Camisa "," marca A" },
     {"1024", " Camisa "," marca A" },
     {"1025", " Camisa "," marca B" },
     
     {"1026", " CHOMPAS "," marca A" },
     {"1027", " chompas "," marca A" },
     {"1028", " chompas "," marca B" },
     {"1029", " chompas "," marca B" },
     {"1030", " chompas "," marca A" },
};
this.precio = new double[][]{
     //MUJERES 
     { 10, 20, 30 },     // POLO, CAMISA, CHOMPAS
     { 40, 50, 60 },
     { 70, 80, 90},
     { 100, 200, 300},
     { 400, 500, 600 },
     //HOBRES 
     {10, 20, 30 },     // POLO, CAMISA, CHOMPAS
     { 40, 50, 60 },
     { 70, 80, 90},
     { 100, 200, 300},
     { 400, 500, 600 },
 };
}
}
