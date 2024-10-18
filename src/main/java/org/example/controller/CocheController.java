package org.example.controller;

import org.example.model.*;
import org.example.view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CocheController {
    private MainFrame view;
    private CocheManager model;
    private List<Coche> coches;

    public CocheController(MainFrame view, CocheManager model) {
        this.view = view;
        this.model = model;
        this.coches = model.cargarCoches();

        view.setAgregarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCoche();
            }
        });

        view.setListarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarCoches();
            }
        });
    }

    private void agregarCoche() {
        String marca = view.getMarca();
        String modelo = view.getModelo();
        String matricula = view.getMatricula();
        int anno;
        String fechaVenta = view.getFechaVenta();

        try {
            anno = Integer.parseInt(view.getAnno());
            Coche coche = new Coche(marca, modelo, matricula, anno, fechaVenta);
            coches.add(coche);
            model.guardarCoches(coches);
            view.mostrarMensaje("Coche agregado correctamente.");
        } catch (NumberFormatException e) {
            view.mostrarMensaje("Por favor, ingrese datos validos.");
        }
    }

    private void listarCoches() {
        StringBuilder sb = new StringBuilder();
        for (Coche coche : coches) {
            sb.append(coche.toString()).append("\n");
        }
        view.mostrarCoches(sb.toString());
    }
}