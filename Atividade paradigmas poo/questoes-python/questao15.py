class SaldoInsuficienteException(Exception):
    def __init__(self, saldo, valor_saque):
        super().__init__(f"Saque de {valor_saque} não permitido.\nSaldo disponível: {saldo}")

class ContaBancaria:
    def __init__(self, saldo):
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(self.saldo, valor)
        self.saldo -= valor
        print(f"Saque de {valor} realizado com sucesso.\nSaldo atual: {self.saldo}")

# Exemplo de uso
conta = ContaBancaria(2000)

try:
    conta.sacar(150)
except SaldoInsuficienteException as e:
    print(e)  
