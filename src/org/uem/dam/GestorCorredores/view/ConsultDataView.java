package org.uem.dam.GestorCorredores.view;

import org.uem.dam.GestorCorredores.model.SubMenu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultDataView implements SubMenu {
    private JTable displayTable;
    private JPanel consultDataViewPanel;
    private JButton updateBtn;
    private JRadioButton hombreRadioButton;
    private JRadioButton mujerRadioButton;
    private JRadioButton ambosRadioButton;
    private ButtonGroup filterBtnGroup;

    public JButton getUpdateDataBtn() {
        return updateBtn;
    }

    public JPanel getRoot() {
        return consultDataViewPanel;
    }

    private void createUIComponents() {
        displayTable = new JTable();
        DefaultTableModel tableModel = new DefaultTableModel();
        displayTable.setModel(tableModel);
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Dorsal");
        tableModel.addColumn("Sexo");
        tableModel.addColumn("Edad");
        tableModel.addColumn("Modalidad");
        hombreRadioButton = new JRadioButton();
        hombreRadioButton.setActionCommand("Hombre");
        mujerRadioButton = new JRadioButton();
        mujerRadioButton.setActionCommand("Mujer");
        ambosRadioButton = new JRadioButton();
        ambosRadioButton.setActionCommand("Ambos");
        ambosRadioButton.setSelected(true);
    }

    public JTable getDisplayTable() {
        return displayTable;
    }

    public ButtonGroup getFilterBtnGroup() {
        return filterBtnGroup;
    }
}
