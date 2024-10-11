package service;

public abstract class Funcionario {

    public String nome;

    public String getNome() {
        return nome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

}
