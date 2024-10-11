package main

import (
	"fmt"
	"sync"
)

type Configuracao struct {
	Valor string
}

var instance *Configuracao

var once sync.Once

func GetConfiguracao() *Configuracao {
	once.Do(func() {
		instance = &Configuracao{Valor: "Primeiro valor"}
	})
	return instance
}

func main() {

	config := GetConfiguracao()
	fmt.Println("Configuração inicial:", config.Valor)

	config.Valor = "Arroz"
	
	config2 := GetConfiguracao()
	fmt.Println("Configuração após modificação:", config2.Valor)

	fmt.Println("As instâncias são iguais:", config == config2)
}
