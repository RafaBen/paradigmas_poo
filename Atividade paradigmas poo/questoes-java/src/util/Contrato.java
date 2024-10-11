package util;

import service.Impressora;

public class Contrato implements Impressora{
    public void imprimir(){
        System.out.println("Imprimindo contrato");
    }
}
