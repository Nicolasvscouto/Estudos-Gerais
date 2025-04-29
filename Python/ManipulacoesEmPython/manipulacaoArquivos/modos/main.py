#vamos abrir o arquivo

#arquivo1 = open("Python\\testeInicial\\manipulacaoArquivos\\modos\\dados.txt", "w") #o w significa que o modo que vamos abrir o arquivo para escrita

#arquivo1.write("Primeira linha!")
#arquivo1.write("\nSegunda Linha") #precisamos adicionar quebra linha ja que o write nao adiciona sozinho

#arquivo1.close() #agora fechamos o arquivo para q ele nao fique aberto e cause algum problema

#agora vamos ler o arquivo, podemos usar print para mostrar ou ate listas que puxam tudo

#arquivo1 = open("Python\\testeInicial\\manipulacaoArquivos\\modos\\dados.txt", "r") agora usamos o modo R para explicar que vamos ler o que esta no arquivo
"""
OBS: temos 3 modos de pegar algo do arquivo: Read, readline e readlines
Read = pega tudo do arquivo e eh uma string
Readline = pega uma linha apenas e eh uma string
readlines = pega todas linhas e cria uma lista delas
"""
#a melhor forma de pegar algo escrito eh utilizando iteracao, e tambem existe o metodo with open que realiza o fechamento do arquivo automaticamente apos a execucao
with open("Python\\testeInicial\\manipulacaoArquivos\\modos\\dados.txt", "r") as arquivo:
    for linhas in arquivo:
        print("Aqui esta: ", linhas)