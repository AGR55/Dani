/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import app.Omnibus;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 *
 * @author A-GORE
 */
public class ModeloOmnibus extends AbstractTableModel{
    ArrayList<Omnibus> omnibus;
    String[] columns={"ID", "Chapa", "Destino", "Chofer", "Cantidad Km"};

    public ModeloOmnibus(ArrayList<Omnibus> omnibus) {
        this.omnibus=omnibus;
    }

    @Override
    public int getRowCount() {
        return omnibus.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Omnibus omn=omnibus.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> omn.getId();
            case 1 -> omn.getChapa();
            case 2 -> omn.getDestino();
            case 3 -> omn.getChofer();
            case 4 -> omn.getCantKm();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column){
        return columns[column];
    }
}
