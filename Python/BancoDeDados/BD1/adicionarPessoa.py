#arquivo utilizado para realizar as operacoes

from modelos import Pessoa
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
         comando = '''
                   INSERT INTO Pessoa VALUES 
                   (:machado, :balao, :dataDeMorte, :Miopia);
                   '''
         cursor.execute(comando,{"machado": pessoa.cpf, "balao":pessoa.nome, 
                                 "dataDeMorte":pessoa.data_nascimento,
                                 "Miopia":pessoa.usa_oculos
                                 })
         conexao.commit()        
     except conector.Error as erro:
         print("Houve algum erro na operacao", erro)
     finally:
         cursor.close()
         conexao.close()
    


def main():
    pathBD = "Python\\BancoDeDados\\BD1\\banco.bd"
    conexao = conexaoBD(pathBD)
    pessoa1 = Pessoa(2029540504, 'Jose', '2024-09-15', True)
    realizarOperacao(conexao, pessoa1)



if __name__ == "__main__":
    main()