package com.project;

import com.project.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller2 {
    
    public void escriuNom() {
        System.out.println("Hola: " + Main.nom);
    }
    public void escriuEdat() {
        System.out.println("Tens: " + Main.edat);
    }

    @FXML
    private void tornar() {
        UtilsViews.showView("Vista1");
    }
}
