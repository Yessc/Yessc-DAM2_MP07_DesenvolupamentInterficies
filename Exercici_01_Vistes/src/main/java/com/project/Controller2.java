package com.project;

import com.project.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller2 {
    
    @FXML
    private Label mensajeLabel;


    public void actualizarmsg(){
        mensajeLabel.setText("Hola "+ Main.nom+ " Tens: " + Main.edat + " anys.");
        //escriuNom();
        //escriuEdat();
    }
    /*public void escriuNom() {
        System.out.println("Tu nombre es: "+ Main.nom);
    }
    public void escriuEdat() {
        System.out.println("Tens: " + Main.edat);
    }*/

    @FXML
    private void tornar() {
        UtilsViews.showView("Vista1");
    }
}
