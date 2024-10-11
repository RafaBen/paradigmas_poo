class Configuracao:
    _instancia = None 

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
        return cls._instancia

    def __init__(self):
       
        if not hasattr(self, 'inicializado'):
            self.opcoes = {}
            self.inicializado = True  

    def definir_opcao(self, chave, valor):
        self.opcoes[chave] = valor

    def obter_opcao(self, chave):
        return self.opcoes.get(chave)

config1 = Configuracao()
config2 = Configuracao()

config1.definir_opcao('tema', 'escuro')

print(config2.obter_opcao('tema'))  
print(config1 is config2)         
