package util;

import java.util.ArrayList;
import java.util.List;

import service.Escola;

public class Professor {

    private String nome;
    private List<Escola> escolas;

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola){

        if(!escolas.contains(escola)){
            escolas.add(escola);
            escola.adicionarProfessor(this);
        }
    }
    
    public void listarEscolas() {
        System.out.println(nome + " leciona: ");
        for (Escola escola : escolas) {
            System.out.println(escola.getNome());
        }
        System.out.println("\n");
    }   


}
