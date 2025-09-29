package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField display;

    private double firstNumber = 0;
    private String operator = "";

    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        display.appendText(value);
    }

    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        firstNumber = Double.parseDouble(display.getText());
        operator = value;
        display.clear();
    }

    @FXML
    private void handleEquals() {
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        switch(operator) {
            case "+": result = firstNumber + secondNumber; break;
            case "-": result = firstNumber - secondNumber; break;
            case "*": result = firstNumber * secondNumber; break;
            case "/": result = firstNumber / secondNumber; break;
        }

        display.setText(String.valueOf(result));
    }

    @FXML
    private void handleClear() {
        display.clear();
        firstNumber = 0;
        operator = "";
    }
}
