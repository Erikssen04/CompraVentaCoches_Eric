package org.example;

import org.example.controller.*;
import org.example.model.*;
import org.example.view.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            CocheManager model = new CocheManager();
            new CocheController(frame, model);
            frame.setVisible(true);
        });
    }
}
