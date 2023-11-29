package app;

public class ListaEspera extends Pasajero{
    private final String[] destinos;

    public ListaEspera(String ID, String[] destinos){
        super(ID);
        this.destinos = destinos;
    }

    public String[] getDestinos(){
        return destinos;
    }
}
