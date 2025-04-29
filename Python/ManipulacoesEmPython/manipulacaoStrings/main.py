"""
Vamos ver métodos para manipulação de string (join, split, strip e count)
Vamos ver f-string e format
"""

def saladinha(x, y): #nome ilustrativo (nao coloquem o nome da funcao de vcs de saladinha)
    """
    Retorna o maior entre dois números.
    """
    if(x > y):
        return x
    else:
        return y

# 1. Vamos testar os métodos de manipulação

try:
    arquivo = open("Python\\ManipulacoesEmPython\\manipulacaoStrings\\dados1.txt", "r")
    resultado = arquivo.read() # Vamos ler tudo que está no arquivo
    arquivo.close() # É importante fechar o arquivo após a leitura

    # Agora vamos contar quantas vezes a palavra "Ola" é escrita no texto
    contagem = resultado.count("Ola")
    print(contagem) # A contagem mostrará que, no texto, tem uma ocorrência de "Ola"

    print()
    print()

    # Agora vamos pegar a string 'resultado' e transformá-la em uma lista
    lista_resultado = resultado.split()

    print(type(lista_resultado))
    print(lista_resultado)

    print()
    print()

    # Por último, temos o método strip() que remove todos os espaços em branco de um texto (ou outros caracteres especificados)
    texto_exemplo = "   Texto com espaços nas extremidades   "
    texto_limpo = texto_exemplo.strip()
    print(f"Texto original: '{texto_exemplo}'")
    print(f"Texto limpo: '{texto_limpo}'")

except FileNotFoundError:
    print("Erro: O arquivo 'dados1.txt' não foi encontrado no caminho especificado.")

"""
Agora vamos para a formatação de string com F-string e format()
"""

# F-string e format() têm várias utilidades, porém, irei só ilustrar algumas aqui

nome = 'Joao'

mensagem = f'meu nome eh {nome}' # Podemos passar a variável dentro de chaves em f-string
mensagem1 = 'meu nome eh {}'.format(nome)

# Podemos utilizar f-string para chamar métodos também e até verificações dentro das próprias strings

teste = f'Você tem idade suficiente? {19 >= 20}' # Isso retornará False ou True
teste2 = f'X(20) eh maior que Y(15)? {saladinha(20, 15)}' # Vai retornar X (20) caso ele seja maior que Y, caso não seja, Y que retornará

print(mensagem)
print(mensagem1)
print(teste)
print(teste2)

print()
print()

# Também podemos definir tamanhos de caracteres que tal variável pode ter durante a f-string

lista_frutinhas = ["Abacate", "Maca", "Uva", "Pera"]

for frutas in lista_frutinhas:
    print(f"Nome da Fruta: {frutas:<10} \n Quantidade de caracteres:{len(frutas):>3}")
    # Caso o tamanho do nome da fruta exceda o limitador, isso será ignorado e, mesmo assim, o nome será aplicado
    # O '<10' alinha o texto à esquerda em um espaço de 10 caracteres.
    # O '>3' alinha o número à direita em um espaço de 3 caracteres.