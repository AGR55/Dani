package app;

import java.util.ArrayList;

public class Turismo extends Omnibus{
    private String horallegada_terminal;
    private int cantAsientos_disp;

    public Turismo(String id, String chapa, String destino, String chofer, double cantKm, String horallegada_terminal, int cantAsientos_disp, ArrayList<Pasajero> pasajeros) {
        super(id, chapa, destino, chofer, cantKm, pasajeros);
        this.horallegada_terminal = horallegada_terminal;
        this.cantAsientos_disp = cantAsientos_disp;
    }

    @Override
    public double Precio(){

        if (cantKm<100){
            return 10;
        }
        else if (cantKm>=100 && cantKm<200){
            return 20;
        }
        else{
            return 30;
        }
    }

    public int getCantAsientos_disp(){
        return cantAsientos_disp;
    }

    public String getHorallegada_terminal() {
        return horallegada_terminal;
    }

    public void setCantAsientos_disp(){
        cantAsientos_disp--;
    }
}
