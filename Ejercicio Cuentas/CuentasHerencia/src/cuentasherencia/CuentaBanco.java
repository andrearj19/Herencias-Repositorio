
package cuentasherencia;

public class CuentaBanco{
    String titular;
    String tipo;
    public CuentaBanco(String titular, String tipo){
        this.titular = titular;
        this.tipo = tipo;
        
    }
      public void mostrarTitular() {
        System.out.println("EL TITULAR DE LA CUENTA ES: " + titular);
    }
}
