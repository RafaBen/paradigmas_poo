from abc import ABC, abstractmethod

class Documento(ABC):
    @abstractmethod
    def gerar(self):
        pass
    
    @abstractmethod
    def exibir_informacoes(self):
        pass

class Relatorio(Documento):
    def __init__(self, titulo, conteudo):
        self.titulo = titulo
        self.conteudo = conteudo
    
    def gerar(self):
        print(f"Gerando relatório: {self.titulo}")
    
    def exibir_informacoes(self):
        print(f"Relatório - Título: {self.titulo}, Conteúdo: {self.conteudo}")


class Contrato(Documento):
    def __init__(self, partes, valor):
        self.partes = partes
        self.valor = valor
    
    def gerar(self):
        print(f"Gerando contrato entre {self.partes} no valor de R${self.valor:.2f}")
    
    def exibir_informacoes(self):
        print(f"Contrato - Partes: {self.partes}, Valor: R${self.valor:.2f}")

relatorio = Relatorio("Relatório Financeiro", "Detalhes financeiros de 2023")
contrato = Contrato("Empresa A e Empresa B", 100000.00)

relatorio.gerar()
relatorio.exibir_informacoes()

contrato.gerar()
contrato.exibir_informacoes()
