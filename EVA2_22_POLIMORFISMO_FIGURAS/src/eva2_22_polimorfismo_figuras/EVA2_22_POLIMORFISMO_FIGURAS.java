/*

 */
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;


public class EVA2_22_POLIMORFISMO                                                                                                                                                                                                                                                                                                                                                  _FIGURAS {
 
    
     public static void main(String[] args) { 
  
      Circulo1[] circ = new Circulo1[10];    
    //Un arreglo en java va de la posición 0 a la N-1
    //N es la cantidad de elementos del arreglo
 
     /*for(int i = 0; i<circ.length; i++){
     circ [i] = new Circulo1(5); <---- Se crea cada uno de los objetos 
     circ [i].ImprimirDatos();
    
     circ [0] = new Circulo1();    
      circ [0].calcularA();
    }*/
        
   
    Figuras1[] figuras; //Se declara un arreglo, pero no se ha creado
    // Con el Scanner capturamos por el teclado la cantidad de figuras a utilizar
    Scanner input = new Scanner(System.in); //Input nos permite capturar  
         System.out.println("Figuras a capturar: ");
       int cant = input.nextInt();
      figuras = new Figuras1[cant]; //Se crea el arreglo con la cantidad de figuras que desea el usuario
      
    for(int i = 0; i < cant; i++){
        
      System.out.println("\nCaptura el tipo de figura:\n");
        System.out.println("1. Círculo\n"
                + "2. Triángulo");
        
       int figu = input.nextInt();
     
     if (figu == 1){ //Circulo
         
      Circulo1 circu = new Circulo1();
         System.out.println("Introduzca el radio: ");
         circu.setRadio(input.nextDouble());
      figuras[i] = circu;
        
      } else //Triangulo {
      
         System.out.println("Introduzca la base:");
           
       
     
      }
    
      //Imprimir resultados
      for (int i =0; i<figuras.length; i++){
          
            if (figuras[i] instanceof Circulo1){
               System.out.println("\nCírculo.\n");
             System.out.println("Área: " +figuras[i].calcularA());
          System.out.println("Peímetro: "+figuras[i].calcularPe());
          
          Circulo1 circu = (Circulo1)figuras[i]; //Casting
          circu.ImprimirDatos();
          
            } else {
               System.out.println("\nTriángulo.\n"); 
             System.out.println("Área: " +figuras[i].calcularA());
          System.out.println("Peímetro: "+figuras[i].calcularPe()+"\n");
          
          Triangulo1 trian = (Triangulo1)figuras[i]; //Casting
          trian.ImprimirDatos();
            }
         
      }
    
    }  
      
      
   //Polimorfismo: Convertir un objeto de una subclase a un objeto de una superclase   
    
    
    
  }
 
  
    
