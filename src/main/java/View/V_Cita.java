package View;

import Controller.C_Cita;
import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class V_Cita {

    private int numero;
    private int tipo;
    private double tarifa;

    Scanner x = new Scanner(System.in);

    public int capturaNumero() {
        System.out.println("Digite numero de cita: ");
        this.numero = x.nextInt();
        return this.numero;
    }

    public int capturaTipo() {
        System.out.println("Digite tipo de cita: ");

        this.tipo = x.nextInt();
        return this.tipo;
    }

    public double capturaTarifa() {
        System.out.println("Digite tarifa: ");

        this.tarifa = x.nextDouble();
        return this.tarifa;
    }

    public void mostrarResultados() {
        C_Cita control = new C_Cita();
        control.crearCita();
    }

}
