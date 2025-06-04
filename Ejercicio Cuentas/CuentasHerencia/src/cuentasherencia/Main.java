
package cuentasherencia;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese el tipo de cuenta> ");
        String tipoCuenta = sc.nextLine();

        if (tipoCuenta.equalsIgnoreCase("Ahorro")) {
            System.out.print("Ingrese el saldo inicial: ");
            double saldo = sc.nextDouble();
            CuentaAhorro cuentaAhorro = new CuentaAhorro(titular, tipoCuenta, saldo, 5);
            cuentaAhorro.mostrarTitular();
            cuentaAhorro.interes();

        } else if (tipoCuenta.equalsIgnoreCase("Corriente")) {
            CuentaCorriente cuentaCorriente = new CuentaCorriente(titular, tipoCuenta, 7);
            cuentaCorriente.mostrarTitular();
            cuentaCorriente.interes();
        }
    }
}

