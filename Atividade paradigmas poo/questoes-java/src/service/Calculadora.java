package service;

public class Calculadora {

    public String somar (int num1, int num2){
        int resultado = num1 + num2;
        return "O resuntado da soma é: " + resultado;
    }
    

    public String somar (int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        return "O resuntado da soma é: " + resultado;
    }

}
