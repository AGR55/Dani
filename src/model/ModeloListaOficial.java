package model;

import app.ListaOficial;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloListaOficial extends AbstractTableModel {
    private ArrayList<ListaOficial> lista;
    private String[] columns={"ID", "Dia de Salida", "Destinos"};

    public ModeloListaOficial(ArrayList<ListaOficial> lista) {
        this.lista=lista;
    }

    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ListaOficial lis=lista.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> lis.getID();
            case 1 -> lis.getDia_salida();
            case 2 -> lis.getDestino();
            default -> null;
        };
    }

    public String getColumnName(int column){
        return columns[column];
    }

}
