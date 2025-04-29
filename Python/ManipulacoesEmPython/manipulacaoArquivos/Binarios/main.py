"""
Carregar uma imagem simples do sistema de arquivos.
Converter a imagem em uma representação binária usando a biblioteca PIL (Python Imaging Library).
Exibir os dados binários da imagem.
Salvar esses dados em um arquivo binário.
Fazer uma cópia desse arquivo binário.
Manipular os dados do arquivo binário cópia (por exemplo, inverter os bytes, adicionar ruído etc.).
Carregar a imagem modificada a partir do arquivo binário e exibi-la para ver o efeito das manipulações.
"""

from PIL import Image
import numpy as np

def main():
  #carregamos a imagem e a exibimos 
  img = Image.open("Python\\testeInicial\\manipulacaoArquivos\\Binarios\\teste1.png")
  img.show()


  #transformar a imagem em array

  img_data = np.array(img)
  data_binary = img_data.tobytes()

  #salvar o binario em arquivo

  with open("Python\\testeInicial\\manipulacaoArquivos\Binarios\\imagem_original.png", "wb") as arquivo:
    arquivo.write(data_binary)


  #copiar o arquivo binario 

  with open("Python\\testeInicial\\manipulacaoArquivos\Binarios\\imagem_original.png", "rb") as original_file:
    data = original_file.read()


  with open("Python\\testeInicial\\manipulacaoArquivos\Binarios\\copia_imagem.png", "wb") as copy_file:
    copy_file.write(data)


  #converter os bytes
  with open("Python\\testeInicial\\manipulacaoArquivos\Binarios\\copia_imagem.png", "rb") as file:
    data = bytearray(file.read()) #adicionado os byte num vetor para facilitar manipulacao

  #invertendo os bytes
  data = data[::-1]


  #adicionando os bytes invertindos na imagem copia
  with open("Python\\testeInicial\\manipulacaoArquivos\Binarios\\copia_imagem.png", "wb") as file:
    file.write(data)

  
    modified_data = np.frombuffer(data, dtype=np.uint8).reshape(img_data.shape)
    modified_img = Image.fromarray(modified_data)
    modified_img.show()
 

if __name__ == "__main__":
 main()
