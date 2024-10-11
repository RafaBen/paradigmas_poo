package service;

import util.SaldoException;

public class ContaBancaria {

    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {

        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }
        else{
            System.out.println("Valor de deposito invalido");
        }
    }

    public void sacar(double valor) throws SaldoException {
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realidado com sucesso");
        }
        else {
            throw new SaldoException("Saldo insuficiente para realizar o saque");
        }
    }



}
