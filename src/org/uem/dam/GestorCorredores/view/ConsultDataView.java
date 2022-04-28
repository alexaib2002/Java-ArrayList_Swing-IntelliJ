package org.uem.dam.GestorCorredores.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultDataView {
    private JTable displayTable;
    private JPanel consultDataViewPanel;
    private JButton updateBtn;

    private void createUIComponents() {
        displayTable.setModel(new DefaultTableModel());
    }
}
