package generate;

import app.*;

import java.util.ArrayList;
import java.util.Date;

public class Generadora {
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<Omnibus> omnibus;

    public Generadora() {
        this.pasajeros = new ArrayList<>();
        this.omnibus = new ArrayList<>();
    }

    Pasajero pasajero1=new ListaOficial("A100", new Date(2023, 12, 12), "Pinar del Rio");
    Pasajero pasajero2=new ListaOficial("A101", new Date(2023, 7, 23), "Holguin");
    Pasajero pasajero3=new ListaOficial("A102", new Date(2023, 6, 22), "Las Tunas");
    Pasajero pasajero4=new ListaOficial("A103", new Date(2023, 5, 11), "La Habana");
    Pasajero pasajero5=new ListaOficial("A104", new Date(2023, 8, 15), "Santiago");
    Pasajero pasajero6=new ListaEspera("A105", new String[]{"Guantanamo", "Santiago", "Holguin"});
    Pasajero pasajero7=new ListaEspera("A105", new String[]{"Ciego de Avila", "Sancti Spiritus", "Camaguey"});
    Pasajero pasajero8=new ListaEspera("A105", new String[]{"Pinar del Rio", "Matanzas", "Cienfuegos"});
    Pasajero pasajero9=new ListaEspera("A105", new String[]{"La Habana", "Mayabeque", "Artemisa"});
    Pasajero pasajero0=new ListaEspera("A105", new String[]{"Guantanamo", "Las Tunas", "Santa Clara"});

    //Omnibus omnibus1=new Astro("O100", "B140305", "Guantanamo", );
    //Omnibus omnibus2=new Astro();
    //Omnibus omnibus3=new Astro();
    //Omnibus omnibus4=new Astro();
    //Omnibus omnibus5=new Astro();
    //Omnibus omnibus6=new Turismo();
    //Omnibus omnibus7=new Turismo();
    //Omnibus omnibus8=new Turismo();
    //Omnibus omnibus9=new Turismo();
    //Omnibus omnibus0=new Turismo();

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public ArrayList<Omnibus> getOmnibus() {
        return omnibus;
    }
}
