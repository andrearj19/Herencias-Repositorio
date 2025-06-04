
package herenciapoo;

//se uza la palabra extends para heredar los datos de la clase Animal

public class Perro extends Animal {
    String raza;
    int vacunas;
    public Perro(String tipo, String raza, int edad, int vacunas){
        super(tipo,edad);
        
        this.vacunas = vacunas;
        this.raza = raza;
        
    }
    public void ladrar(){
        System.out.println("Guau guau- Soy un: "+raza);
    }
    public void vacunas(){
        if(edad <= 3)
       System.out.println("Tengo 4 vacunas");
        else{
            System.out.println("Soy un adulto");
        }
 
       
  
   }
    }

