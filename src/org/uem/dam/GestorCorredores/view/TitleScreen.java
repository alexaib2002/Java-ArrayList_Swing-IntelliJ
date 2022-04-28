package org.uem.dam.GestorCorredores.view;

import org.uem.dam.GestorCorredores.model.SubMenu;

import javax.swing.*;

public class TitleScreen implements SubMenu {
    private JPanel mainPanel;

    @Override
    public JPanel getRoot() {
        return mainPanel;
    }
}
