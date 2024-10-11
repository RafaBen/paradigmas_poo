class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, other):
        if isinstance(other, Produto):
            return self.preco + other.preco
        return NotImplemented

    def __repr__(self):
        return f"Produto({self.nome}, {self.preco})"


produto1 = Produto("Arroz 10kg", 90.0)
produto2 = Produto("Feijão 10KG", 90.0)

preco_total = produto1 + produto2
print(f"produto1: {produto1}")
print(f"produto2: {produto2}")
print(f"Preço total: {preco_total}") 
