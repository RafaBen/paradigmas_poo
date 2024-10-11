package service;

public class Configuracao {

    private static Configuracao unicaInstancia;

    private String nomeDoSistema;
    private String versao;


    private Configuracao() {
       
        this.nomeDoSistema = "Meu Sistema";
        this.versao = "1.0";
    }

    public static Configuracao getInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new Configuracao(); 
        }
        return unicaInstancia;
    }

    public String getNomeDoSistema() {
        return nomeDoSistema;
    }

    public void setNomeDoSistema(String nomeDoSistema) {
        this.nomeDoSistema = nomeDoSistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void mostrarConfiguracoes() {
        System.out.println("Nome do Sistema: " + nomeDoSistema);
        System.out.println("Versão: " + versao);
    }
}
