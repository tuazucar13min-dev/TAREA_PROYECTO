/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;


import java.util.Scanner;
import com.mycompany.trabajo.Trabajo;
import com.mycompany.trabajo.Producto;
/**
 *
 * @author CIELO
 */
public class Trabajo {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner imput = new Scanner ( System.in );
        int cantidad, escoge;
        
        
        
        System.out.println( " ------Escoge el tipo de ropa-----  ");
        System.out.println ("1: Polos ");
        System.out.println(" 2: Camisa ");
        System.out.println(" 3: Chompas");
        System.out.println(" ----------------------------------  ");

        escoge = imput.nextInt();
        System.out.println (" 1: Ropa para hombre ");
        System.out.println (" 2: Ropa para mujer  ");
        int ropa = imput.nextInt();
        
        if (ropa == 2 )
        {
           switch ( escoge )
           {       case 1:
                   
                   break;
                   case 2:
                   System.out.println(" Tipos de Camisa ");
                   System.out.println (" 1: Camisa a cuadros ");
                   System.out.println (" 2: Camisa de popelina ");
                   System.out.println (" 3: Camisa denim ");
                   break;
                   case 3:
                   System.out.println(" Tipos de chompas Chompas");
                   System.out.println (" 1: Chompa Casual  ");
                   System.out.println (" 2: Chompa Zafin Cierre ");
                   System.out.println (" 3: Chompa Hypnotic Lurex ");
                   break;
           }
        
        }
        else
        {
            switch ( escoge )
           {       case 1: 
                   System.out.println (" Tipo de polos  ");
                   System.out.println (" 1: POLO ... $");
                   System.out.println (" 2: POLO ... $");
                   System.out.println (" 3: POLO ... $ ");
                   break;
                   case 2:
                   System.out.println(" Tipos de Camisa ");
                   System.out.println (" 1: ... $");
                   System.out.println (" 2: ... $");
                   System.out.println (" 3:... $ ");
                   break;
                   case 3:
                   System.out.println(" Tipos de chompas Chompas");
                   System.out.println (" 1: POLO ... $");
                   System.out.println (" 2: POLO ... $");
                   System.out.println (" 3: POLO ... $ ");
                   break;
           }
        }
        System.out.println(" cantidad ");
        int catidad =imput.nextInt();
      
        if ( catidad > 10  )
        { System.out.println(" Haz comprado mas de 10 productos ");
          System.out.println(" Descuento 5% ");
          
        // RECORDAR: modificar utilizar arreglos para los nombres y precios de los productos 
        }
        
           
    }    
    
}