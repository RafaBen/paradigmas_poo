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


def emitir_sons(animais):
    for animal in animais:
        print(animal.som())


meu_cachorro = Cachorro("Kakashi")
meu_gato = Gato("Fuba")
outro_cachorro = Cachorro("Apolo")

animais = [meu_cachorro, meu_gato, outro_cachorro]


emitir_sons(animais)