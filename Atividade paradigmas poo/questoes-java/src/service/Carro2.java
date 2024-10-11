package service;

import util.Motor;

public class Carro2 {

    public String marca;
    public String modelo;
    public int ano;
    public int velocidade;
    public Motor motor;

    public Carro2(String marca, String modelo, int ano,Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        motor.exibirDetalhesMotor();
        System.out.println(" ");
    }

    public void acelerar (int value){
        velocidade += value;
        System.out.println("(Acelerando) Velocidade atual: " + velocidade + " km/h");
    }

    public void frear (int value){
        velocidade -= value; 

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("(Freando) Velocidade atual: " + velocidade + " km/h");
    }
    
    public void exibirVelocidade (){

        System.out.println("Velocidade final: " + velocidade + " km/h");
    }
}




