from modelos import Carro
import sqlite3 as conector

def conexaoBD(pathDB):
    try:
        conexao = conector.connect(pathDB)
        conexao.exceute("PRAGMA foreign_keys = on") #isso eh para incluir todas as restricoes de chaves estrangeiras
        print("Conectado com sucesso!")
        return conexao
    except conector.OperationalError as falhaConexao:
        print("Parece que voce nao conseguiu se conectar ao banco de dados!", falhaConexao)
        return None
    
def realizarOperacao(conexao, pessoa):
     cursor = conexao.cursor()
     try:
         comando = '''
                   
                   '''
         cursor.execute()
         conexao.commit()        
     except conector.Error as erro:
         print("Houve algum erro na operacao", erro)
     finally:
         cursor.close()
         conexao.close()
    


def main():
    pathBD = "Python\\BancoDeDados\\BD1\\banco.bd"
    conexao = conexaoBD(pathBD)

    realizarOperacao(conexao)


if __name__ == "__main__":
    main()