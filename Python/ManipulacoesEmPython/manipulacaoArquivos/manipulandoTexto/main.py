def main():
    print("Digite as frases que voce deseja, ou digite -sair para encerrar o programa e salvar o texto")
    frases = []
    while True:
        entrada = input("> ")
        if entrada.lower() == "sair":
            break
        frases.append(entrada)

#vamos aplicar as frases que escrevemos no arquivo

    with open("Python\\testeInicial\\manipulacaoArquivos\\manipulandoTexto\\loremIpsum.txt", "w") as arquivo:
        for frase in frases:
            arquivo.write(frase + "\n")

    dados_modificados = []
    with open("Python\\testeInicial\\manipulacaoArquivos\\manipulandoTexto\\loremIpsum.txt", "r") as arquivo:
        for linha in arquivo:
            dados_modificados.append(linha.strip().upper()) #pegar linha por linha, remover a quebra de linha e transformar tudo em maiusculo
    
    with open("Python\\testeInicial\\manipulacaoArquivos\\manipulandoTexto\\loremIpsum.txt", "w") as arquivo:
        for linha in dados_modificados:
            arquivo.write(linha + "\n") 

    print("Dados modificados com sucesso!")




if __name__ == "__main__":
    main()