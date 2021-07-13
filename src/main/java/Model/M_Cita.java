package Model;

public class M_Cita {

    private int numero;
    private int tipo;
    private double tarifa;
    private double valorfinal;

    public M_Cita(int numero, int tipo, double tarifa) {
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;
        this.valorfinal = 0.0;
    }
    
    public int getNumero(){
        return  this.numero;
    }

    public String getTipo() {
        if (this.tipo >= 1 && this.tipo <= 3) {
            return "Cita General";
        } else if (this.tipo == 4 || this.tipo == 5) {
            return "Cita Especialista";
        } else {
            return "Tipo cita invalida";
        }
    }

    public double getTarifa() {
        if (this.getTipo().equals("Cita General")) {
            this.valorfinal = this.tarifa - (this.tarifa * 0.5);
        } else if (this.getTipo().equals("Cita Especialista")) {
            this.valorfinal = this.tarifa + (this.tarifa * 0.5);
        }
        return valorfinal;
    }

}
