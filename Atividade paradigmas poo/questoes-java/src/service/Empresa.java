package service;

import java.util.ArrayList;
import java.util.List;

import util.Empregado;

public class Empresa {

    private String nome;
    private List<Empregado> empregados;


    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado){
        empregados.add(empregado);
    }

    public void listarEmpregados(){
        System.out.println("Empregados na empresa" + nome + ":");
        for(Empregado empregado:empregados){
            System.out.println(empregado);
        }
    }
    
    


}
