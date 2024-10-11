
class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def exibir_informacoes(self):
        print(f"Nome: {self.nome}, Cargo: {self.cargo}, Salário: R${self.salario:.2f}")


class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = [] 
    
    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)
        print(f"Empregado {empregado.nome} adicionado à empresa {self.nome}.")
    
    def listar_empregados(self):
        if self.empregados:
            print(f"\nLista de empregados da empresa {self.nome}:\n")
            
            for empregado in self.empregados:
                empregado.exibir_informacoes()
        else:
            print(f"A empresa {self.nome} não possui empregados no momento.")


empresa = Empresa("Arcturos Tech")


empregado1 = Empregado("Gabriel", "Desenvolvedor", 5000.00)
empregado2 = Empregado("Fabricio", "Analista de Sistemas", 7000.00)
empregado3 = Empregado("Vitoria", "Designer", 4000.00)

empresa.adicionar_empregado(empregado1)
empresa.adicionar_empregado(empregado2)
empresa.adicionar_empregado(empregado3)


empresa.listar_empregados()