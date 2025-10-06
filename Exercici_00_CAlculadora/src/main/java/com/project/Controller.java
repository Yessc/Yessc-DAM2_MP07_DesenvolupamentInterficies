package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import com.project.Calculadora;
import javafx.event.ActionEvent;
 


public class Controller {

    @FXML
    private TextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean nuevaOperation = true;
    private Calculadora calculadora  = new Calculadora();
    


     @FXML
    private void handleNumber(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if(nuevaOperation){
            display.setText(value);
            nuevaOperation = false;
        }else{
            display.appendText(value);
        }

    }

    @FXML
    private void handleOperator(ActionEvent event) {
        String newOperator = ((Button)event.getSource()).getText();
        double actualNumber = Double.parseDouble(display.getText());

        if (!operator.isEmpty()) {//compruebo si el operador no esta vacio
            calculadora.setNum1(firstNumber);
            calculadora.setNum2(actualNumber);
            calculadora.setOperation(operator);
        try{
            firstNumber = calculadora.calcular();
            display.setText(String.valueOf(firstNumber));
            
        }catch(ArithmeticException e){
            display.setText("Error");
            nuevaOperation = true;
            operator = "";
        }
        }else{
            firstNumber = actualNumber;
        }
        operator = newOperator;
        nuevaOperation = true;
    }
    @FXML
    private void handleEquals() {
        double secondNumber = Double.parseDouble(display.getText());

        calculadora.setNum1(firstNumber);
        calculadora.setNum2(secondNumber);
        calculadora.setOperation(operator);
        try{
            double result = calculadora.calcular();
            display.setText(String.valueOf(result));
            operator = "";
            nuevaOperation = true;
        }catch(ArithmeticException e){
            display.setText("Error");
            nuevaOperation = true;
            operator = "";
        }

    }

    @FXML
    private void handleClear() {
        display.clear();
        firstNumber = 0;
        operator = "";
        nuevaOperation = true;
    }

}
