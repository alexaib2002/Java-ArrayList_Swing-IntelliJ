package org.uem.dam.GestorCorredores.main;

import org.uem.dam.GestorCorredores.controller.SystemController;
import org.uem.dam.GestorCorredores.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            MainWindow mainWindow = new MainWindow();
            SystemController controller = new SystemController(mainWindow);
            mainWindow.setController(controller);
        });
    }
}
