package main

import "fmt"

type Motor struct {
	potencia int 
	tipo     string 
}

func (m Motor) Informar() string {
	return fmt.Sprintf("Motor: %s, Potência: %d CV", m.tipo, m.potencia)
}

type Carro struct {
	marca string
	modelo string
	ano int
	motor Motor 
}

func (c Carro) Informar() string {
	return fmt.Sprintf("Carro: %s %s (%d) - %s", c.marca, c.modelo, c.ano, c.motor.Informar())
}

func main() {
	motor1 := Motor{potencia: 150, tipo: "Gasolina"}

	carro1 := Carro{marca: "Toyota", modelo: "Supra", ano: 2020, motor: motor1}

	fmt.Println(carro1.Informar())
}
