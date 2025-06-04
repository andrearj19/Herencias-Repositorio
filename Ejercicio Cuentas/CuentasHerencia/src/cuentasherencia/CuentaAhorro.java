
package cuentasherencia;

public class CuentaAhorro extends CuentaBanco {
    double saldo;
    int interes;

    public CuentaAhorro(String titular, String tipo, double saldo, int interes) {
        super(titular, tipo);
        this.saldo = saldo;
        this.interes = interes;
    }

    public void interes() {
        double calculoInter = (saldo * interes) / 100;
        double saldoFinal = saldo + calculoInter;
        System.out.println("Su saldo original es: " + saldo);
        System.out.println("El interés del 5% es: " + calculoInter);
        System.out.println("Su saldo con interés es: " + saldoFinal);
    }
}


