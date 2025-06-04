
package herenciapoo;

import java.util.Scanner;

public class Animal {
    String tipo;
    int edad;
    public Animal(String tipo, int edad){
        this.tipo = tipo;
        this.edad = edad;
    }
   public void describir(){
       System.out.println("Tipo:"+tipo+"\nEdad:"+edad);
   }
   public void edad(){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Ingrese la edad de su mascota:");
       edad = sc.nextInt();
       if(edad <= 3)
           System.out.println("Es un cachorro");
       else{
           
               System.out.println("Es un adulto");
       }
  
   }
}
