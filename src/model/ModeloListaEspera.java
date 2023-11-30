package model;

import app.ListaEspera;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloListaEspera extends AbstractTableModel {
    private ArrayList<ListaEspera> lista;
    private String[] columns={"ID", "Destinos"};

    public ModeloListaEspera(ArrayList<ListaEspera> lista) {
        this.lista=lista;
    }

    @Override
    public int getRowCount() {
        return 2;
    }

    @Override
    public int getColumnCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ListaEspera lis=lista.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> lis.getID();
            case 1 -> lis.getDestinos();
            default -> null;
        };
    }

    public String getColumnName(int column){
        return columns[column];
    }
}
