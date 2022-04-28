package org.uem.dam.GestorCorredores.view;

import org.uem.dam.GestorCorredores.controller.SystemController;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JMenuItem conCorrMnItm;
    private JMenuItem intCorrMnItm;
    private JMenuItem salMnItm;
    private JScrollPane mainViewPanel;
    private JPanel contentPane;
    private JLabel errLbl;

    private InsertDataView insertDataView;
    private ConsultDataView consultDataView;

    private SystemController controller;

    public MainWindow() {
        initWindowAttributes();
        initSubMenuViews();
    }

    public void setController(SystemController controller) {
        this.controller = controller;
        conCorrMnItm.addActionListener(controller);
        intCorrMnItm.addActionListener(controller);
        salMnItm.addActionListener(controller);
        insertDataView.getSaveDataBtn().addActionListener(controller);
        insertDataView.getClearFieldsBtn().addActionListener(controller);
        consultDataView.getUpdateDataBtn().addActionListener(controller);
    }

    public InsertDataView getInsertDataView() {
        return insertDataView;
    }

    public ConsultDataView getConsultDataView() {
        return consultDataView;
    }

    public void executeMenuAction(String action) {
        System.out.println(action);
        switch (action) {
            case "Introducir corredor":
                mainViewPanel.setViewportView(insertDataView.getRoot());
                break;
            case "Consultar corredores":
                mainViewPanel.setViewportView(consultDataView.getRoot());
                break;
            case "Salir":
                if (JOptionPane.showConfirmDialog(
                        this,
                        "Se va a cerrar el programa, ¿confirmar?",
                        "Confirmar cierre",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE
                ) == JOptionPane.YES_OPTION) {
                    System.exit(NORMAL);
                }
                break;
        }
        updateWindowSize();
    }

    public void pushError(String err, Color col) {
        errLbl.setText(err);
        errLbl.setForeground(col);
        updateWindowSize();
    }

    private void initWindowAttributes() {
        setVisible(true);
        updateWindowSize();
        setContentPane(contentPane);
        setMinimumSize(new Dimension(getMinimumSize()));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initSubMenuViews() {
        insertDataView = new InsertDataView();
        consultDataView = new ConsultDataView();
    }

    private void updateWindowSize() {
        pack();
        repaint();
    }

}
