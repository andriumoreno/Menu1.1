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
                   
                   
                   while (n1==3){// el mismo algorito comparando usuarios anteriores con los nuevos
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
                   else// si no hay coincidencias el usuario puede ingresar el 5to usario
                   {
                   n1 = 4;
                   }
                   }
                   while(n1==4){// El mismo algoritmo que compara si el usuario ya existe
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
                   else// si no hay coincidencias el usario puede continuar
                   {
                   n1 = 5;
                   }
                   }
                  n1 = 0;// que reinicie la variable que maneja los algoritmos de comparacion 
                  p = 0;// una vez ingresado que regrese al sub menu 1
           break;
           case 2:
           System.out.println(nombre1);//que imprima el orden en el que fueron ingresado
           System.out.println(nombre2);
           System.out.println(nombre3);
           System.out.println(nombre4);
           System.out.println(nombre5);
           
           break;
           case 3:
           System.out.println(nombre5);// que imprima el orden contrario al que fueron ingresados  
           System.out.println(nombre4);
           System.out.println(nombre3);
           System.out.println(nombre2);
           System.out.println(nombre1);
           break;
           case 4:
           p = 0; // devuelvo la variable p a o  
           m = 0;// con esto le ordeno que regrese al menu principal
           break;
       }
       }
       break;
       case 2:// variables manejadas en este caso i y n 
       while( m == 2)
       {    
       System.out.println("1.Ingresar numeros\n"// le pido que me imprima el segundo menu
               + "2.Mostrar numero de digitos\n"
               + "3.menu principal");
       n = teclado.nextInt();// que escoja al menu que el desee ingresar
       switch (n){
        case 1: 
               System.out.println("Ingresar numeros");
               contador = teclado.nextInt();// le pido que ingrese el numero
                    if (contador >= 100000)// si el numero es mas grande que 100000
                    {
                    System.out.println("Error");// muestre en pantalla error 
                    contador = 0;// y que salga del menu
                    }
                    else
                    {
                    while ( contador >= 1)// si el numero es menos de 100000
                    {
                    contador = contador/10;  // que divida el valor de contador hasta que sea menor o igual que 1
                    i= i +1;// y por cada vez que ejecute la accion pasada que le sume 1 a i
                    }
                    }    
                    n = 0;// que salga del menu
       break;
       case 2:
           System.out.println("El numero de digitos es " + i + "." );// que imprima el numero de digitos
           n = 0;//regreso las variables a su valor
           i = 0;//regreso las variables a su valor
           break;
           case 3:
           n = 0;//regreso las variables a su valor   
           m = 0;  // le pido que me regrese al menu principal  
           break;   
       }
       }
       break;
       case 3:// variables manejadas en este case x y z
           int x = 0;
           int y = 0;
           int z = 0;
           int a;
       while( m== 3){    
       System.out.println("1.Ingresar numeros\n"
               + "2.Mostrar ordenados\n"
               + "3.menu principal"); // le pido que me muestre el menu de ordenar numeros 
       a = teclado.nextInt();// que ingrese al menu que guste
       switch (a){
           case 1:
           System.out.println("Ingrese 3 numeros");    
           x = teclado.nextInt();// le pido que ingrese los numeros
           y = teclado.nextInt();
           z = teclado.nextInt();
           a = 0;
           break;
           case 2:// aqui ingrese las posibles formas que existen para ordenar los numeros ingresados y escoja la que corresponde
               if( x>=y && y>=z )
               {
                System.out.println("el orden es el siguente" +z +"," +y  +"," +x +"." );
                a = 0;
               }
               if( x>=z && z>=y )
               {
                System.out.println("el orden es el siguente" +y +"," +z  +"," +x +"." );
                a = 0;
               }
               if( y>=x && x>=z )
               {
                System.out.println("el orden es el siguente" +z +"," +x  +"," +y +"." );
                a = 0;
               }
               if( y>=z && z>=x )
               {
                System.out.println("el orden es el siguente" +x +"," +z  +"," +y +"." );
                a = 0;
               }
               if( z>=x && x>=y )
               {
                System.out.println("el orden es el siguente" +y +"," +x  +"," +z +"." );
                a = 0;
               }
               if( z>=y && y>=x )
               {
                System.out.println("el orden es el siguente" +x +"," +y  +"," +z +"." );
                a = 0;
               }
           break;
           case 3:
           m = 0;
           a = 0;// le pido que me regrese al menu principal
           break;    
                    }    //
       }
       
       break;
       case 4:// es el sub menu de donde se ingresaran las notas de 6 estudiantes y se mostran en forma de matriz
       int ño;  // manejara el sub menu de ingresar notas y de mostralas asi como de regresarte al menu principal
       int k;// con esta variable nosotros seleccionamos sobre que fila de la columna nos moveremos
       int deadpool [][] = new int [6][6];// con esto declaro el arreglo de 2 dimenciones y le digo de cuanto por cuanto lo quiero
       deadpool [0][0] =1;// les dejo un valor fijo por que no necesitare modificarlas en el programa
       deadpool [1][0] =2;
       deadpool [2][0] =3;
       deadpool [3][0] =4;
       deadpool [4][0] =5;
       deadpool [5][0] =6;

       while (m == 4){     
       System.out.println("1.Ingresar notas\n"//aqui se imprimien el menu numero 4
               + "2.Mostrar cuadro de notas\n"
               + "3.menu principal");// ahora solo falta eso
       ño = teclado.nextInt();
           switch (ño){
                case 1:     
                while (ño == 1){    
                System.out.println("Seleccione el id");  
                k = teclado.nextInt();// le pido al usuario que ingrese id pero el id es el equivante a la fila que se quiera modificar
                
                if ( k <= 6){// si numero ingresado es menor igual que 6 que ingrese
                System.out.println("Ingrese las notas");// que imprima ingrese las notas
                for (int columna = 1; columna < 6; columna++) {// me muevo sobre las diferentes casillas que tiene la fila. le digo que comienze en la casilla 1 y que se dentenga en la ultima
                    if (columna == 5) {// cuando llegue a la casilla numero 5 que me sume los valores anteriormente ingresados
                        deadpool[k-1][columna] = (deadpool[k-1][1] + deadpool[k-1][2] + deadpool[k-1][3] + deadpool[k-1][4])/4;  
                    }
                    else {
                        deadpool[k-1][columna] = teclado.nextInt();// pero mientras no sea la casilla 5 que lea los valores que le ingresa el usario
                    }
                }
                ño = 0;
                }
                if (k > 6){// si el id es mayo que 6
                System.out.println("Id incorrecto");  // que imprima que es in correct y lo regrese a ingresar nuevamente el id 
                k = 0;
                }
                
                }
                break;
                case 2:
                    System.out.println("Cuadro de Notas");// que imprima un titulo 
                 
                    for(int filas = 0; filas< 6 ; filas++){//2. cada vez que se termine de contar las casilla que cambie de fila
                        System.out.println("");//3. y que me deje un espacio cada vez que termine con las casilas
                        
                        
                        for(int columna = 0;columna < 6; columna++ ){// 1. le pido que se mueva dentro de las casillas de la fila y que imprima su valor
                            System.out.print(deadpool[filas][columna]+"\t");
                        }
                    }
                  System.out.println("");  // al final tambien necesito que deje un espacio 
                break;
                case 3:
                ño = 0;
                m = 0;// regresar al menu principal
                break;
           }
       }
        break;
       }
      
      
    }
    }
    }
                 
//https://github.com/andriumoreno/Menu/commits/master
//https://github.com/andriumoreno/Menu/blob/2495c3906c23e6f5dc88fc0efd6b20a487e1572e/src/hellowordapp/Hellowordapp.java


