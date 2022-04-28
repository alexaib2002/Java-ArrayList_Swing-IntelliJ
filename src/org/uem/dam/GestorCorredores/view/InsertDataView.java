package org.uem.dam.GestorCorredores.view;

import org.uem.dam.GestorCorredores.model.SubMenu;

import javax.swing.*;

public class InsertDataView implements SubMenu {
    private JTextField nomTxtField;
    private JTextField dorTxtField;
    private JRadioButton mlRdBtn;
    private JRadioButton fmRdBtn;
    private JSpinner ageSpn;
    private JComboBox modCBox;
    private JButton saveDataBtn;
    private JButton clearFieldsBtn;
    private JPanel insertDataViewPanel;
    private ButtonGroup sexBtnGroup;


    public JPanel getRoot() {
        return insertDataViewPanel;
    }

    public JButton getSaveDataBtn() {
        return saveDataBtn;
    }

    public JButton getClearFieldsBtn() {
        return clearFieldsBtn;
    }

    public JTextField getNomTxtField() {
        return nomTxtField;
    }

    public JTextField getDorTxtField() {
        return dorTxtField;
    }

    public ButtonGroup getSexBtnGroup() {
        return sexBtnGroup;
    }

    public JRadioButton getMlRdBtn() {
        return mlRdBtn;
    }

    public JRadioButton getFmRdBtn() {
        return fmRdBtn;
    }

    public JSpinner getAgeSpn() {
        return ageSpn;
    }

    public JComboBox getModCBox() {
        return modCBox;
    }
}
