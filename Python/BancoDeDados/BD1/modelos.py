#arquivo usado para criar classes para a implementacao de querys dinamicas

class Pessoa:
    def __init__(self, cpf, nome, data_nascimento, usa_oculos):
        self.cpf = cpf
        self.nome = nome
        self.data_nascimento = data_nascimento
        self.usa_oculos = usa_oculos

class Marca:
    def __init__(self, id, nome, sigla):
        self.id = id
        self.nome = nome
        self.sigla = sigla


class Carro:
    def __init__(self, placa, ano, cor, motor, proprietario, marca):
        self.placa = placa
        self.ano = ano
        self.cor = cor
        self.motor = motor
        self.proprietario = proprietario
        self.marca = marca
        
        