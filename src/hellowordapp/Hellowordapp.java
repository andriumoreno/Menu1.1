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
        
        while ( m == 0){// Permanecer en este menu mientas m sea 0
            Scanner teclado = new Scanner(System.in);
            System.out.println("[IPC1]Tarea3_201602851 \n"// Imprimir el menu principal
                    + "1.Usuarios \n"
                    + "2.Contador de digitos\n"
                    + "3.Tres numeros de mayor a menor\n"
                    + "4.Calcular promedio\n"
                    + "5.Salir");
            m = teclado.nextInt();// le pido al usuario que ingrese a cualquiera de las opciones del menu
        
            switch (m) {//Indico que value el valor de la variable y me y dependediend del valor entre a un submenu
                case 1:  // variables manejadas en esta case p
                int n1 = 0;    
                    while (m == 1){ // que se quede en submenu mientras m sea 1   
       System.out.println("1.Ingresar usarios\n"// le prid que imprima el sub menu 1
               + "2.Mostrar Usuarios ascendentes\n"
               + "3.Mostrar Usuarios Decendente\n"
               + "4.Menu principal");
       p = teclado.nextInt();//ingresar el valor de, le pido al usuario que ingrese el valor de p
              switch (p){// que cambie segun el valor de p   
                   case 1: // menu ingresar usuario
                   System.out.println("Ingresar usuario1");// imprima ingresar el nombre del usuario
                   InputStreamReader in = new InputStreamReader(System.in);// No estoy muy seguro de lo que hice aqui
                   BufferedReader buffer = new BufferedReader(in);// pero me funciono :)
                   try{
                   nombre1 = buffer.readLine();// le pido al usuario que ingrese su nombre
                   }catch(IOException e){};
                   n1 = 1;// que cambie de valor la variable para que entre al algoritmo de deteccion de usuario repetidos
                   while( n1 == 1 ) {// le pido al programa que se quede aqui hasta que se cumplan las condiciones
                   System.out.println("Ingresar usuario2");//ingresar el nombre del usuario
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader buffe = new BufferedReader(isr);
                   try{
                   nombre2 = buffe.readLine();// le pido que ingrese el segundo usuario
                   }catch(IOException e){};
                   if (nombre1.equals(nombre2))// si el nombre del usario1 es igual al usario 2 lo regreso para que lo ingrese nuevamente
                   {
                   System.out.println("Usuario existente");  
                   nombre2 = "";
                   }
                   else{// si no son iguales puede continuar con el otro nombre
                   n1 = 2;
                   }
                   }
                   
                   
                   while(n1 == 2){// Es el mismo algoritmo usado anterior mente con la diferencia que ahora comparara la entrada con los dos usarios anteriore
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
                   else{// si no hay concidencias el usario puede escribir el tercer usario 
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
               if( x>=y && y>=z ){
                System.out.println("el orden es el siguente" +z +"," +y  +"," +x +"." );
                a = 0;
               }
               if( x>=z && z>=y ){
                System.out.println("el orden es el siguente" +y +"," +z  +"," +x +"." );
                a = 0;
               }
               if( y>=x && x>=z ){
                System.out.println("el orden es el siguente" +z +"," +x  +"," +y +"." );
                a = 0;
               }
               if( y>=z && z>=x ){
                System.out.println("el orden es el siguente" +x +"," +z  +"," +y +"." );
                a = 0;
               }
               if( z>=x && x>=y ){
                System.out.println("el orden es el siguente" +y +"," +x  +"," +z +"." );
                a = 0;
               }
               if( z>=y && y>=x ){
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
