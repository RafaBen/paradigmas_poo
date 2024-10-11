package main

import (
	"fmt"
)

type Matematica struct{}

func (m Matematica) Fatorial(n int) int {
	if n == 0 {
		return 1
	}
	return n * m.Fatorial(n-1)
}

func main() {
	mat := Matematica{}

	num := 6
	resultado := mat.Fatorial(num)
	fmt.Printf("O fatorial de %d: %d\n", num, resultado)
}
