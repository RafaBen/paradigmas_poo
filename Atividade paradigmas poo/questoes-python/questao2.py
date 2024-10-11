class Carro:
    def __init__(self, modelo, ano):
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0 
    
    def acelerar(self, incremento):
        self.velocidade += incremento
        print(f"O carro acelerou em {incremento} km/h.")
    
    def frear(self, decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0
        print(f"O carro reduziu a velocidade em {decremento} km/h.")
    
    def exibir_velocidade(self):
        print(f"A velocidade atual é {self.velocidade} km/h.")

meu_carro = Carro("Toyta", 2015)
meu_carro.acelerar(50)  
meu_carro.exibir_velocidade()  
meu_carro.frear(5)  
meu_carro.exibir_velocidade() 