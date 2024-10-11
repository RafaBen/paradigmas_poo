class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.__saldo = saldo_inicial  
        self.titular = titular
    
    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor:.2f} realizado com sucesso.")
        else:
            print("O valor do depósito deve ser positivo.")
    

    def sacar(self, valor):
        if valor > 0:
            if valor <= self.__saldo:
                self.__saldo -= valor
                print(f"Saque de R${valor:.2f} realizado com sucesso.")
            else:
                print("Saldo insuficiente para o saque.")
        else:
            print("O valor do saque deve ser positivo.")
    

    def exibir_saldo(self):
        print(f"Saldo atual: R${self.__saldo:.2f}")


minha_conta = ContaBancaria("João", 1000)
minha_conta.depositar(260)  
minha_conta.exibir_saldo()   
minha_conta.sacar(150)      
minha_conta.exibir_saldo()  
minha_conta.sacar(1000)      