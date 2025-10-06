package com.project;

public class Calculadora{

    private double num1 = 0;
    private double num2 = 0;
    private String operator= "";

    public void setNum1(double numero){
        this.num1 = numero;
    }
    public void setNum2(double numero){
        this.num2 = numero;
    }
    public void setOperation(String operation){
        this.operator = operation;
    }
    public double calcular() throws ArithmeticException{
        switch(operator){
            case "+":
                return num1+ num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0){
                    throw new ArithmeticException("Sin definir");
                }
                return num1/ num2;
            default:
                return 0;
        }
    }
}