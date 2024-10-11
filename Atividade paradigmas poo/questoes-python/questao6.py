# Classe Motor
class Motor:
    def __init__(self, potencia):
        self.potencia = potencia  
        self.ligado = False
    
    def ligar(self):
        if not self.ligado:
            self.ligado = True
            print(f"Motor de {self.potencia} estar ligado.")
        else:
            print("O motor já está ligado.")
    
    def desligar(self):
        if self.ligado:
            self.ligado = False
            print("Motor desligado.")
        else:
            print("O motor já está desligado.")


class Carro:
    def __init__(self, modelo, ano, potencia_motor):
        self.modelo = modelo
        self.ano = ano
        self.motor = Motor(potencia_motor)  
    
    def ligar_carro(self):
        print(f"Ligando o carro {self.modelo}...")
        self.motor.ligar()
    
    def desligar_carro(self):
        print(f"Desligando o carro {self.modelo}...")
        self.motor.desligar()

# Exemplo de uso
meu_carro = Carro("Toyta", 2015, 25)  
meu_carro.ligar_carro()  
meu_carro.desligar_carro()  