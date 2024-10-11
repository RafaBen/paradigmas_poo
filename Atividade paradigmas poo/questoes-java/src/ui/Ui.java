package ui;

import java.util.ArrayList;
import java.util.List;

import service.*;
import util.*;


public class Ui {

    public void questao1() {
        Carro carro1 = new Carro ("BMW","320i",2014);
        Carro carro2 = new Carro ("Ford","Mustang Gt",2024);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }

    public void questao2() {
        Carro carro1 = new Carro ("Chevrolet","Corvette",2022);
        
        carro1.exibirDetalhes();
        carro1.acelerar(30);
        carro1.acelerar(20);
        carro1.frear(10);
        carro1.frear(5);

        carro1.exibirVelocidade();
    }

    public void questao3() throws SaldoException {
        ContaBancaria conta = new ContaBancaria(500, "Mauro Gabirel");

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo()+'\n');

        conta.depositar(1240.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo()+'\n');

        conta.sacar(50.0);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo()+'\n');

        conta.sacar(10.0);
        System.out.println("Saldo final: R$ " + conta.getSaldo()+'\n');
    }

    public void questao4() {

        Animal animal = new Animal();

        animal.somGato();
        animal.somCachorro();
    }

    public void questao5() {
        List<Som> animais = new ArrayList<>();

        Animal gato = new Animal() {
            @Override
            public void som() {
                somGato();
            }
        };
        
        Animal cachorro = new Animal() {
            @Override
            public void som() {
                somCachorro();
            }
        };

        animais.add(gato);
        animais.add(cachorro);

  
        Som.emitirSons(animais);
       
    }

    public void questao6(){
        
        Motor motor1 = new Motor(387,"Gasolina");
        Carro2 carro1 = new Carro2 ("BMW","320i",2014,motor1);

        carro1.exibirDetalhes();

        carro1.exibirDetalhes();
    }

    public void questao7(){
        Escola escola1 = new Escola("Escola Raio de sol");
        Escola escola2 = new Escola("Escola Sesi");

        Professor professor1 = new Professor("Professor Lucas");
        Professor professor2 = new Professor("Professor Eduardo");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);

        escola2.adicionarProfessor(professor1);

        escola1.listarProfessores();
        escola2.listarProfessores();

        professor1.listarEscolas();
        professor2.listarEscolas();
    }

    public void questao8(){
        Empresa empresa = new Empresa("Arcturos Tech");

        Empregado empregado1 = new Empregado("Gabriel", "Desenvolvedor", 5000.00);
        Empregado empregado2 = new Empregado("Fabricio", "Analista de Sistemas", 4500.00);
        Empregado empregado3 = new Empregado("Vitoria", "Design", 7000.00);

        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);
        empresa.adicionarEmpregado(empregado3);

        empresa.listarEmpregados();
    }

    public void questao9(){

        Impressora relatorio = new Relatorio();
        Impressora contrato = new Contrato();

        relatorio.imprimir();
        contrato.imprimir();
    }

    public void questao10(){
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(20,30));
        System.out.println(calc.somar(20,60,20));

    }

    public void questao11(){
        FuncionarioHorista horista = new FuncionarioHorista("Maria", 35.0, 190);
        System.out.println("Funcionário Horista: " + horista.getNome() + ", Salário: R$ " + horista.calcularSalario());

        // Criando um funcionário assalariado
        FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Julia", 4000.0);
        System.out.println("Funcionário Assalariado: " + assalariado.getNome() + ", Salário: R$ " + assalariado.calcularSalario());
    }

    public void questao12(){
        Produto produto1 = new Produto("Cafe", 12.9);
        Produto produto2 = new Produto("Açucar", 10.9);

        double soma = produto1.somarPrecos(produto2);
        System.out.println("A soma dos preços: R$ " + soma);
    }

    public void questao13(){
        int numero = 5;
        int fatorial = Matematica.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }

    public void questao14(){
        Configuracao config1 = Configuracao.getInstancia();
        config1.mostrarConfiguracoes();
        
        config1.setNomeDoSistema("Novo Sistema");
        config1.setVersao("2.0");

        Configuracao config2 = Configuracao.getInstancia();
        config2.mostrarConfiguracoes();

        System.out.println("Sistema alterado com sucesso? " + (config1 == config2));  
    }

    public void questao15(){
        ContaBancaria conta = new ContaBancaria(500.0, "João");

        // Tentativa de saque válido
        try {
            conta.sacar(100.0);
            System.out.println("Saldo após saque: R$ " + conta.getSaldo());
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }

        // Tentativa de saque com saldo insuficiente
        try {
            conta.sacar(600.0); // Saque superior ao saldo disponível
        } catch (SaldoException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem da exceção
        }
    }
}
