package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	titular string
	saldo   float64 
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
	} else {
		fmt.Println("O valor do depósito deve ser positivo.")
	}
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > 0 {
		if valor <= c.saldo {
			c.saldo -= valor
			return nil
		} else {
			return errors.New("saldo insuficiente")
		}
	}
	return errors.New("o valor do saque deve ser positivo")
}


func (c *ContaBancaria) ExibirSaldo() float64 {
	return c.saldo
}

func (c *ContaBancaria) DefinirTitular(titular string) {
	c.titular = titular
}

func (c *ContaBancaria) ObterTitular() string {
	return c.titular
}

func main() {

	conta := ContaBancaria{}
	conta.DefinirTitular("Mauro")

	fmt.Println("Titular:", conta.ObterTitular())

	conta.Depositar(10000.00)
	fmt.Printf("Saldo após depósito: %.2f\n", conta.ExibirSaldo())

	err := conta.Sacar(2300.00)
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Printf("Saldo após saque: %.2f\n", conta.ExibirSaldo())
	}

	err = conta.Sacar(500.00)
	if err != nil {
		fmt.Println(err)
	}
}
