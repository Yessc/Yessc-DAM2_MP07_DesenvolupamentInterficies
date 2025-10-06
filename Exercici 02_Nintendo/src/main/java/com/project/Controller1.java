package com.project;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller1 {

    @FXML
    private Button btnClick;

    @FXML
    private Label label;

    @FXML
    private void initialize() {
        btnClick.setOnAction(e -> label.setText("¡Has hecho clic en el botón!"));
    }

}
