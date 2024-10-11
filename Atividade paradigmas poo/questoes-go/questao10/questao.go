package main

import "fmt"

type Calculadora struct{}

func (c Calculadora) SomarDois(a, b float64) float64 {
	return a + b
}

func (c Calculadora) SomarTres(a, b, d float64) float64 {
	return a + b + d
}

func main() {
	calculadora := Calculadora{}


	resultadoDois := calculadora.SomarDois(34, 920)
	fmt.Printf("Resultado da soma de dois números: %.2f\n", resultadoDois)

	resultadoTres := calculadora.SomarTres(120, 30, 160)
	fmt.Printf("Resultado da soma de três números: %.2f\n", resultadoTres)
}
