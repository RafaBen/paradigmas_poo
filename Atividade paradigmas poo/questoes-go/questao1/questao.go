package main

import "fmt"

type Carro struct {
    marca  string
    modelo string
    ano    int
}

func main() {
    carro1 := Carro{"Toyota", "Supra", 2020}
    carro2 := Carro{"BMW", "320i", 2021}
   
    fmt.Println(carro1)
    fmt.Println(carro2)
}