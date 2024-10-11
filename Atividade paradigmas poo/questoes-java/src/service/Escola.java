package service;

import java.util.ArrayList;
import java.util.List;

import util.Professor;

public class Escola {
    
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
            professor.adicionarEscola(this);
        }
    }

    public void listarProfessores() {
        System.out.println("Professores na " + nome + ":");
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
        System.out.println("\n");
    }
}
