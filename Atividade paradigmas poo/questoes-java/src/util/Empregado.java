package util;

public class Empregado {

    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCargo: " + cargo + "\nSalário: " + salario;
    }
    

}
