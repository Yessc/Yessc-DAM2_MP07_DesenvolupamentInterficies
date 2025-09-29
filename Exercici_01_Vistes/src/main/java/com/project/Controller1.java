package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import com.project.UtilsViews;
import com.project.Main;

public class Controller1 {

    @FXML
    private TextField nomField;

    @FXML
    private TextField edatField;

    @FXML
    private Button segueixButton;

    @FXML
    public void initialize() {
        segueixButton.setDisable(true);

        nomField.textProperty().addListener((obs, oldVal, newVal) -> validar());
        edatField.textProperty().addListener((obs, oldVal, newVal) -> validar());
    }
    private void validar() {
        segueixButton.setDisable(nomField.getText().isEmpty() || edatField.getText().isEmpty());
    }

    @FXML
    private void canviaVista() {
        Main.nom = nomField.getText();
        Main.edat = edatField.getText();
        UtilsViews.showView("Vista2");
    }


}