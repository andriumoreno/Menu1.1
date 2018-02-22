/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowordapp;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Ivan Flores
 */
public class Hellowordapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p, m = 0;
        
        while ( m == 0){
        Scanner teclado = new Scanner(System.in);
        System.out.println("[IPC1]Tarea3_201602851");
        System.out.println("1.Usuarios");
        System.out.println("2.Contador de digitos");
        System.out.println("3.tres numeros de mayor a menor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");
        m = teclado.nextInt();
        
       switch (m) {
       case 1:  
       while (m == 1){    
       System.out.println("1.Ingresar usarios");
       System.out.println("2.Mostrar Usuarios ascendentes");
       System.out.println("3.Mostrar Usuarios Decendente");
       System.out.println("4.Menu principal");
       p = teclado.nextInt();
       switch (p){   
           case 1: 
               System.out.println("Ingresar usuario");
               p = 0;
           break;
           case 2:
           break;
           case 3:
           break;
           case 4:
           p = 0;   
           m = 0;
           break;
       }
       }
       break;
       case 2:
       System.out.println("1.Ingresar numeros");
       System.out.println("2.Mostrar numero de digitos");
       System.out.println("3.menu principal");
       break;
       case 3:
       System.out.println("1.Ingresar numeros");
       System.out.println("2.Mostrar ordenados");
       System.out.println("3.menu principal");
       break;
       case 4:
       System.out.println("1.Ingresar numero");
       System.out.println("2.Mostrar numero de digitos");
       System.out.println("3.menu principal");
       break;
       }
        }
    }
                
 // TODO code application logic here


}
