
package herenciapoo;

public class Main1 {
      public static void main (String[]args){
      System.out.println("Ejemplo de HERENCIA");
      Perro p = new Perro("Mamifero","Labrador",5 , 3);
      p.describir();
      p.ladrar();
      p.edad();
      p.vacunas();
  }  
}
