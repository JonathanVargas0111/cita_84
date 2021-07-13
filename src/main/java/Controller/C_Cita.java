
package Controller;

import Model.M_Cita;
import View.V_Cita;

/**
 *
 * @author jonathan
 */
public class C_Cita {
    private int numero;
    private int tipo;
    private double tarifa;
    
    V_Cita  View_Cita = new V_Cita();
    
    public void capturaDatos(){
        this.numero = View_Cita.capturaNumero();
        this.tipo = View_Cita.capturaTipo();
        this.tarifa = View_Cita.capturaTarifa();
    }
    
    public void crearCita(){
        this.capturaDatos();
        M_Cita  citaMedica = new M_Cita (this.numero, this.tipo, this.tarifa);
        System.out.println("Cita Numero : "+citaMedica.getNumero());
        System.out.println("Su cita : "+citaMedica.getTipo());
        System.out.println("Valor a pagar : "+citaMedica.getTarifa());
    }
    
}
