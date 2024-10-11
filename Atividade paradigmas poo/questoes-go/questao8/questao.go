package main

import (
	"fmt"
)

type Empregado struct {
	nome    string
	cargo   string
	salario float64
}

func (e Empregado) Informar() string {
	return fmt.Sprintf("Nome: %s, Cargo: %s, Salário: %.2f", e.nome, e.cargo, e.salario)
}

type Empresa struct {
	nome       string
	empregados []*Empregado
}

func (emp *Empresa) AdicionarEmpregado(e *Empregado) {
	emp.empregados = append(emp.empregados, e)
}

func (emp Empresa) Informar() {
	fmt.Println("Empresa:", emp.nome)
	fmt.Println("Empregados:")
	for _, empregado := range emp.empregados {
		fmt.Println(empregado.Informar())
	}
}

func main() {
	empresa := Empresa{nome: "Arcturus Tech"}

	emp1 := &Empregado{nome: "Gabriel", cargo: "Desenvolvedor", salario: 100000.00}
	emp2 := &Empregado{nome: "Fabricio", cargo: "Analista", salario: 80000.00}
	emp3 := &Empregado{nome: "Vitoria", cargo: "Gerente", salario: 90000.00}

	empresa.AdicionarEmpregado(emp1)
	empresa.AdicionarEmpregado(emp2)
	empresa.AdicionarEmpregado(emp3)

	empresa.Informar()
}
