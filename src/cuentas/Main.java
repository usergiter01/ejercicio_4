package cuentas;

import cuentas.CCuenta;

/**
 * Clase Main.
 * @author user
 * @version 0.2
 * @since 0.1
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(null);
    }

    /**
     * Permite trabajar con la clase cuenta y alterar el estado
     * de cuentas.
     * @param cantidad Sin uso. Notese que se establecio NULL como default,
     * por lo que la llamada en el metodo main es actualmente incorrecta.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
