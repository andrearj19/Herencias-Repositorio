
package cuentasherencia;
//se uza la palabra extends para heredar los datos de la clase de CuentaAhorro

import java.util.Scanner;


public class CuentaCorriente extends CuentaBanco {
    double saldo;
    int interes;

    public CuentaCorriente(String titular, String tipo, int interes) {
        super(titular, tipo);
        this.saldo = ingresarSaldo();
        this.interes = interes;
    }

    private double ingresarSaldo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el saldo de la cuenta: ");
        return sc.nextDouble();
    }

    public void interes() {
        double interesCalculado = (saldo * interes) / 100;
        double saldoFinal = saldo + interesCalculado;
        System.out.println("Su saldo original es: " + saldo);
        System.out.println("El interés del 7% es: " + interesCalculado);
        System.out.println("Su saldo con interés es: " + saldoFinal);
    }
}

