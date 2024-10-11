package util;

import service.Funcionario;

public class FuncionarioHorista extends Funcionario{

    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, double salarioPorHora, int horasTrabalhadas) {
        super(nome);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabalhadas;
    }
}
