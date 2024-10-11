class Animal:
    def __init__(self, nome):
        self.nome = nome
  
    def som(self):
        raise NotImplementedError("Subclasses devem implementar o método som.")

class Cachorro(Animal):

    def som(self):
        return f"{self.nome} faz: Au au!"

class Gato(Animal):
   
    def som(self):
        return f"{self.nome} faz: Miau!"


meu_cachorro = Cachorro("Kakashi")
meu_gato = Gato("Fuba")

print(meu_cachorro.som())  
print(meu_gato.som())      