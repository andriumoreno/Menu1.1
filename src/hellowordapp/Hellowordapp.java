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
        int p,n, m = 0;//Declaracion de variables donde m Controla el menu principal y p el menu 1
        int contador , i = 0;//contador se ingresa el numero e i guardara el numero de digitos
        int a, x ,y ,z; //variables usadas en el menu 3 ordenar a de mayor a meno
       // variables from hell
        String nombre1 = "" ;
        String nombre2 = "" ;
        String nombre3 = "" ;
        String nombre4 = "" ;
        String nombre5 = "" ;
        while ( m == 0){   
        Scanner teclado = new Scanner(System.in);
        System.out.println("[IPC1]Tarea3_201602851");
        System.out.println("1.Usuarios");
        System.out.println("2.Contador de digitos");
        System.out.println("3.tres numeros de mayor a menor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");
        m = teclado.nextInt();
        
       switch (m) {//Indico que value el valor de la variable y me y dependediend del valor entre a un submenu
       case 1:  // variables manejadas en esta case p
       while (m == 1){    
       System.out.println("1.Ingresar usarios");
       System.out.println("2.Mostrar Usuarios ascendentes");
       System.out.println("3.Mostrar Usuarios Decendente");
       System.out.println("4.Menu principal");
       p = teclado.nextInt();//ingresar el valor de p
       switch (p){// que cambie segun el valor de p   
           case 1: 
               System.out.println("Ingresar usuario1");//ingresar el nombre del usuario
               InputStreamReader in = new InputStreamReader(System.in);
               BufferedReader buffer = new BufferedReader(in);
               try{
                   nombre1 = buffer.readLine();
               }catch(IOException e){};
               
               System.out.println("Ingresar usuario2");//ingresar el nombre del usuario
               InputStreamReader in = new InputStreamReader(System.in);
               BufferedReader buffe = new BufferedReader(in);
               try{
                   nombre2 = buffe.readLine();
               }catch(IOException e){};
             
               p = 0;// una vez ingresado que regrese al sub menu 1
           break;
           case 2:
           System.out.println(nombre1);
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
       case 2:// variables manejadas en este caso i y n 
       while(m==2){    
       System.out.println("1.Ingresar numeros");
       System.out.println("2.Mostrar numero de digitos");
       System.out.println("3.menu principal");
       n = teclado.nextInt();
       switch (n){
        case 1: 
               System.out.println("Ingresar numeros");
               contador = teclado.nextInt();
               if (contador >= 100000){
               System.out.println("Error");    
               }
               else{
               while ( contador >= 1){
               contador = contador/10;  
               i= i +1;
               }
               }    
               n = 0;
           break;
           case 2:
           System.out.println("El numero de digitos es" + i + "." );
           n = 0;
           i = 0;
           break;
           case 3:
           n = 0;   
           m = 0;    
           break;   
       }
       }
       break;
       case 3:// variables manejadas en este case j
       while( m== 3){    
       System.out.println("1.Ingresar numeros");
       System.out.println("2.Mostrar ordenados");
       System.out.println("3.menu principal");
       a = teclado.nextInt();
       switch (a){
           case 1:
           System.out.println("Ingrese 3 numeros");    
           x = teclado.nextInt();
           y = teclado.nextInt();
           z = teclado.nextInt();
           a = 0;
           break;
           case 2:
                if() {
                System.out.println("el orden es el siguente" +  "," +  "," +  "." );
                a = 0;
           }
           break;
           case 3:
           break;    
       }    
       }
       
       break;
       }
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
