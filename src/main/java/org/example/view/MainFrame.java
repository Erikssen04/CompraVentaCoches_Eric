package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField marcaField;
    private JTextField modeloField;
    private JTextField matriculaField;
    private JTextField annoField;
    private JTextField fechaVentaField;
    private JTextArea cochesArea;
    private JButton agregarButton;
    private JButton listarButton;

    public MainFrame() {
        setTitle("Gestor de Coches");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel logoPanel = new JPanel();
        JLabel logoLabel = new JLabel();

        ImageIcon logoIcon = new ImageIcon("src/main/resources/logoEricBugatti.png");
        logoLabel.setIcon(logoIcon);

        logoPanel.add(logoLabel);
        add(logoPanel, BorderLayout.AFTER_LAST_LINE);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Marca:"));
        marcaField = new JTextField();
        inputPanel.add(marcaField);

        inputPanel.add(new JLabel("Modelo:"));
        modeloField = new JTextField();
        inputPanel.add(modeloField);

        inputPanel.add(new JLabel("Matricula:"));
        matriculaField = new JTextField();
        inputPanel.add(matriculaField);

        inputPanel.add(new JLabel("Año:"));
        annoField = new JTextField();
        inputPanel.add(annoField);

        inputPanel.add(new JLabel("Fecha Venta:"));
        fechaVentaField = new JTextField();
        inputPanel.add(fechaVentaField);

        agregarButton = new JButton("Agregar Coche");
        inputPanel.add(agregarButton);

        listarButton = new JButton("Listar Coches");
        inputPanel.add(listarButton);

        add(inputPanel, BorderLayout.NORTH);

        cochesArea = new JTextArea();
        add(new JScrollPane(cochesArea), BorderLayout.CENTER);
    }

    public String getMarca() {
        return marcaField.getText();
    }

    public String getModelo() {
        return modeloField.getText();
    }

    public String getMatricula() {
        return matriculaField.getText();
    }

    public String getAnno() {
        return annoField.getText();
    }

    public String getFechaVenta() {
        return fechaVentaField.getText();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarCoches(String coches) {
        cochesArea.setText(coches);
    }

    public void setAgregarButtonListener(ActionListener listener) {
        agregarButton.addActionListener(listener);
    }

    public void setListarButtonListener(ActionListener listener) {
        listarButton.addActionListener(listener);
    }
}
