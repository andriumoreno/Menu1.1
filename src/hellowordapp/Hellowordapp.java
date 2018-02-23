package hellowordapp;

import java.util.*;
import java.io.*;
/**
 *
 * @author Ivan Flores
 */
public class Hellowordapp {

    public static void main(String[] args) {
        int p,n, m = 0;//Declaracion de variables donde m Controla el menu principal y p el menu 1
        int contador , i = 0;//contador se ingresa el numero e i guardara el numero de digitos
       // variables from hell
        String nombre1 = "" ;
        String nombre2 = "" ;
        String nombre3 = "" ;
        String nombre4 = "" ;
        String nombre5 = "" ;
        
        while ( m == 0){   
            Scanner teclado = new Scanner(System.in);
            System.out.println("[IPC1]Tarea3_201602851 \n"
                    + "1.Usuarios \n"
                    + "2.Contador de digitos\n"
                    + "3.Tres numeros de mayor a menor\n"
                    + "4.Calcular promedio\n"
                    + "5.Salir");
            m = teclado.nextInt();
        
            switch (m) {//Indico que value el valor de la variable y me y dependediend del valor entre a un submenu
                case 1:  // variables manejadas en esta case p
                int n1 = 0;    
                    while (m == 1){    
       System.out.println("1.Ingresar usarios\n"
               + "2.Mostrar Usuarios ascendentes\n"
               + "3.Mostrar Usuarios Decendente\n"
               + "4.Menu principal");
       p = teclado.nextInt();//ingresar el valor de p
              switch (p){// que cambie segun el valor de p   
                   case 1: 
                   System.out.println("Ingresar usuario1");//ingresar el nombre del usuario
                   InputStreamReader in = new InputStreamReader(System.in);
                   BufferedReader buffer = new BufferedReader(in);
                   try{
                   nombre1 = buffer.readLine();
                   }catch(IOException e){};
                   n1 = 1;
                   while( n1 == 1 ) {
                   System.out.println("Ingresar usuario2");//ingresar el nombre del usuario
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader buffe = new BufferedReader(isr);
                   try{
                   nombre2 = buffe.readLine();
                   }catch(IOException e){};
                   if (nombre1.equals(nombre2))
                   {
                   System.out.println("Usuario existente");  
                   nombre2 = "";
                   }
                   else{
                   n1 = 2
                   }
                   }
                   
                   
                   while(n1 == 2){
                   System.out.println("Ingresar usuario3");//ingresar el nombre del usuario
                   InputStreamReader is = new InputStreamReader(System.in);
                   BufferedReader buff = new BufferedReader(is);
                   try{
                   nombre3 = buff.readLine();
                   }catch(IOException e){};
                   if (nombre1.equals(nombre3)|| nombre2.equals(nombre3))
                   {
                   System.out.println("Usuario existente");  
                   nombre3 = "";
                   }
                   else{
                   n1 = 3;
                   }
                   }
                   
                   
                   while (n1==3){
                   System.out.println("Ingresar usuario4");//ingresar el nombre del usuario
                   InputStreamReader lol = new InputStreamReader(System.in);
                   BufferedReader buf = new BufferedReader(lol);
                   try{
                   nombre4 = buf.readLine();
                   }catch(IOException e){};
                   if (nombre1.equals(nombre4)||nombre2.equals(nombre4)||nombre3.equals(nombre4))
                   {
                   System.out.println("Usuario existente");  
                   nombre4 = "";
                   }
                   else
                   {
                   n1 = 4;
                   }
                   }
                   while(n1==4){
                   System.out.println("Ingresar usuario5");//ingresar el nombre del usuario
                   InputStreamReader yolo = new InputStreamReader(System.in);
                   BufferedReader bu = new BufferedReader(yolo);
                   try{
                   nombre5 = bu.readLine();
                   }catch(IOException e){};
                   if (nombre1.equals(nombre5)||nombre2.equals(nombre5)||nombre3.equals(nombre5)||nombre4.equals(nombre5))
                   {
                   System.out.println("Usuario existente");  
                   nombre5 = "";
                   }
                   else
                   {
                   n1 = 5;
                   }
                   }
               
               
               
               
               
                  n1 = 0;
                  p = 0;// una vez ingresado que regrese al sub menu 1
           break;
           case 2:
           System.out.println(nombre1);
           System.out.println(nombre2);
           System.out.println(nombre3);
           System.out.println(nombre4);
           System.out.println(nombre5);
           
           break;
           case 3:
           System.out.println(nombre5);   
           System.out.println(nombre4);
           System.out.println(nombre3);
           System.out.println(nombre2);
           System.out.println(nombre1);
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
       System.out.println("1.Ingresar numeros\n"
               + "2.Mostrar numero de digitos\n"
               + "3.menu principal");
       n = teclado.nextInt();
       switch (n){
        case 1: 
               System.out.println("Ingresar numeros");
               contador = teclado.nextInt();
                    if (contador >= 100000)
                    {
                    System.out.println("Error"); 
                    contador = 0;
                    }
                    else
                    {
                    while ( contador >= 1)
                    {
                    contador = contador/10;  
                    i= i +1;
                    }
                    }    
                    n = 0;
       break;
       case 2:
           System.out.println("El numero de digitos es " + i + "." );
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
           int x = 0;
           int y = 0;
           int z = 0;
           int a;
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
               if(){
                System.out.println("el orden es el siguente" +x +"," +y  +"," +z +"." );
                a = 0;
               }
           break;
           case 3:
           m = 0;
           a = 0;
           break;    
       }    
       }
       
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
