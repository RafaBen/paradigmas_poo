package util;

public class Motor {
    public int potencia;
    public String combustivel;


    public Motor(int potencia, String combustivel) {
        this.potencia = potencia;
        this.combustivel = combustivel;
    }
    public int getPotencia() {
        return potencia;
    }
    public String getCombustivel() {
        return combustivel;
    }

    public void exibirDetalhesMotor() {
        System.out.println("Ptencia do motor: " + potencia);
        System.out.println("Combustivel: " + combustivel);
    }


}
