package org.uem.dam.GestorCorredores.controller;

import org.uem.dam.GestorCorredores.model.Corredor;
import org.uem.dam.GestorCorredores.view.InsertDataView;
import org.uem.dam.GestorCorredores.view.MainWindow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;


public class SystemController implements ActionListener {

    private final ArrayList<Corredor> corrList;
    private final MainWindow mainWindow;

    public SystemController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        corrList = new ArrayList<Corredor>();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        mainWindow.pushError("", Color.BLACK);
        Object source = actionEvent.getSource();
        if (source instanceof JButton) {
            switch (actionEvent.getActionCommand()) {
                case "Guardar datos": {
                    saveData();
                    break;
                }
                case "Limpiar campos": {
                    clearFields();
                    break;
                }
                case "Actualizar datos": {
                    updateTable();
                    break;
                }
            }
        } else if (source instanceof JMenuItem) {
            mainWindow.executeMenuAction(actionEvent.getActionCommand());
        }
    }

    private void saveData() {
        InsertDataView insertDataView = mainWindow.getInsertDataView();
        if (checkData(insertDataView)) {
            corrList.add(new Corredor(
                    insertDataView.getNomTxtField().getText(),
                    insertDataView.getDorTxtField().getText(),
                    (String) insertDataView.getModCBox().getSelectedItem(),
                    insertDataView.getFmRdBtn().isSelected(),
                    (Integer) insertDataView.getAgeSpn().getValue()
            ));
            clearFields();
        } else {
            mainWindow.pushError("Los campos no pueden estar vacíos", Color.RED);
        }
    }

    private boolean checkData(InsertDataView insertDataView) {
        return !insertDataView.getNomTxtField().getText().isEmpty() &&
                !insertDataView.getDorTxtField().getText().isEmpty() &&
                (insertDataView.getFmRdBtn().isSelected() ||
                        insertDataView.getMlRdBtn().isSelected());
    }

    private void clearFields() {
        InsertDataView insertDataView = mainWindow.getInsertDataView();
        insertDataView.getNomTxtField().setText("");
        insertDataView.getDorTxtField().setText("");
        insertDataView.getModCBox().setSelectedIndex(0);
        insertDataView.getSexBtnGroup().clearSelection();
        insertDataView.getAgeSpn().setValue(0);
    }

    private void updateTable() {
        DefaultTableModel tableModel = (DefaultTableModel) mainWindow.getConsultDataView().getDisplayTable().getModel();
        tableModel.setRowCount(0);
        for (Corredor corredor: corrList
             ) {
            tableModel.addRow(new Object[]{
                    corredor.getNombre(),
                    corredor.getDorsal(),
                    corredor.isSexo() ? "Mujer" : "Hombre",
                    corredor.getEdad(),
                    corredor.getModalidad()
            });
        }
    }
}
