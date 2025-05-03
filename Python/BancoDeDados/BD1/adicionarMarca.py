from modelos import  Marca
import sqlite3 as conector

def conexaoBD(pathDB):
    try:
        conexao = conector.connect(pathDB)
        print("Conectado com sucesso!")
        return conexao
    except conector.OperationalError as falhaConexao:
        print("Parece que voce nao conseguiu se conectar ao banco de dados!", falhaConexao)
        return None
    
def realizarOperacao(conexao, pessoa):
     cursor = conexao.cursor()
     try:
         #o comando nao existe ponto
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
  
    realizarOperacao(conexao, pessoa1)



if __name__ == "__main__":
    main()