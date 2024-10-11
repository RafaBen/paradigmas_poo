package main

import "fmt"

// Definindo a estrutura Carro
type Carro struct {
	velocidade int
}

// Método para acelerar o carro
func (c *Carro) Acelerar(aumento int) {
	c.velocidade += aumento
}

// Método para frear o carro
func (c *Carro) Frear(reducao int) {
	c.velocidade -= reducao
	if c.velocidade < 0 {
		c.velocidade = 0
	}
}

// Método para exibir a velocidade atual
func (c *Carro) ExibirVelocidade() {
	fmt.Printf("A velocidade atual é: %d km/h\n", c.velocidade)
}

func main() {
	// Criando uma instância de Carro
	carro := Carro{velocidade: 0}

	// Acelerando e exibindo a velocidade
	carro.Acelerar(80)
	carro.ExibirVelocidade()

	// Freando e exibindo a velocidade
	carro.Frear(20)
	carro.ExibirVelocidade()

	// Freando para zero
	carro.Frear(40)
	carro.ExibirVelocidade()
}
