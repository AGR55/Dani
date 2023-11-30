package app;

import java.util.ArrayList;
import java.util.Date;

public class Astro extends Omnibus{
    private final Date dia_salida;
    private final String hora_salida;
    private final int cant_asientos;

    public Astro(String id, String chapa, String destino, String chofer, double cantKm, Date dia_salida, String hora_salida, int cant_asientos, ArrayList<Pasajero> pasajeros) {
        super(id, chapa, destino, chofer, cantKm, pasajeros);
        this.dia_salida = dia_salida;
        this.hora_salida = hora_salida;
        this.cant_asientos = cant_asientos;
    }

    @Override
    public double Precio(){
        return cantKm*4;
    }

    public Date getDia_salida(){
        return dia_salida;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public int getCant_asientos() {
        return cant_asientos;
    }

    public int cantAsientos_disp(){
        return cant_asientos-pasajeros.size();
    }
}
