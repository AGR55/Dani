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

        Pasajero pasajero1=new ListaOficial("A100", new Date(2023, 12, 12), "Pinar del Rio");
        Pasajero pasajero2=new ListaOficial("A101", new Date(2023, 7, 23), "Holguin");
        Pasajero pasajero3=new ListaOficial("A102", new Date(2023, 6, 22), "Las Tunas");
        Pasajero pasajero4=new ListaOficial("A103", new Date(2023, 5, 11), "La Habana");
        Pasajero pasajero5=new ListaOficial("A104", new Date(2023, 8, 15), "Santiago");
        Pasajero pasajero6=new ListaEspera("A105", new String[]{"Guantanamo", "Santiago", "Holguin"});
        Pasajero pasajero7=new ListaEspera("A106", new String[]{"Ciego de Avila", "Sancti Spiritus", "Camaguey"});
        Pasajero pasajero8=new ListaEspera("A107", new String[]{"Pinar del Rio", "Matanzas", "Cienfuegos"});
        Pasajero pasajero9=new ListaEspera("A108", new String[]{"La Habana", "Mayabeque", "Artemisa"});
        Pasajero pasajero0=new ListaEspera("A109", new String[]{"Guantanamo", "Las Tunas", "Santa Clara"});

        pasajeros.add(pasajero1);
        pasajeros.add(pasajero2);
        pasajeros.add(pasajero3);
        pasajeros.add(pasajero4);
        pasajeros.add(pasajero5);
        pasajeros.add(pasajero6);
        pasajeros.add(pasajero7);
        pasajeros.add(pasajero8);
        pasajeros.add(pasajero9);
        pasajeros.add(pasajero0);

        ArrayList<Pasajero> pasajeros1=new ArrayList<>();
        ArrayList<Pasajero> pasajeros2=new ArrayList<>();
        ArrayList<Pasajero> pasajeros3=new ArrayList<>();
        ArrayList<Pasajero> pasajeros4=new ArrayList<>();
        ArrayList<Pasajero> pasajeros5=new ArrayList<>();
        ArrayList<Pasajero> pasajeros6=new ArrayList<>();
        ArrayList<Pasajero> pasajeros7=new ArrayList<>();
        ArrayList<Pasajero> pasajeros8=new ArrayList<>();
        ArrayList<Pasajero> pasajeros9=new ArrayList<>();
        ArrayList<Pasajero> pasajeros0=new ArrayList<>();

        Omnibus omnibus1=new Astro("O100", "B140305", "Mayabeque", "Javier", 67, new Date(2023, 3, 15), "7", 40, pasajeros1);
        Omnibus omnibus2=new Astro("O101", "B140345", "Ciego de Avila", "Pepe", 10, new Date(2023, 3, 2), "2", 40, pasajeros2);
        Omnibus omnibus3=new Astro("O102", "B140367", "Santiago de Cuba", "Patricio", 23, new Date(2023, 4, 12), "12", 40, pasajeros3);
        Omnibus omnibus4=new Astro("O103", "B140323", "Santa Clara", "Enrique", 50, new Date(2023, 7, 5), "23", 40, pasajeros4);
        Omnibus omnibus5=new Astro("O104", "B140389", "Cienfuegos", "Roberto", 75, new Date(2023, 5, 15), "11", 40, pasajeros5);
        Omnibus omnibus6=new Turismo("O200", "P345234", "Guantanamo", "Maximiliano", 100, "12", 40, pasajeros6);
        Omnibus omnibus7=new Turismo("O201", "P567234", "Pinar del Rio", "Fefa", 56, "1", 40, pasajeros7);
        Omnibus omnibus8=new Turismo("O202", "P893267", "La Habana", "Daniel", 1020, "21", 40, pasajeros8);
        Omnibus omnibus9=new Turismo("O203", "P943387", "Holguin", "Randy", 562, "4", 40, pasajeros9);
        Omnibus omnibus0=new Turismo("O204", "P843843", "Las Tunas", "Leonardo", 345, "6", 40, pasajeros0);

        omnibus.add(omnibus1);
        omnibus.add(omnibus2);
        omnibus.add(omnibus3);
        omnibus.add(omnibus4);
        omnibus.add(omnibus5);
        omnibus.add(omnibus6);
        omnibus.add(omnibus7);
        omnibus.add(omnibus8);
        omnibus.add(omnibus9);
        omnibus.add(omnibus0);
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public ArrayList<Omnibus> getOmnibus() {
        return omnibus;
    }
}
