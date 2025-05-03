import sqlite3 as conector

'''
Conecte-se a um banco de dados SQLite.
Crie três tabelas: Eventos, Participantes e Locais.
Selecione e exiba os dados armazenados.
'''


def criarBD():
    try:
        conexao = conector.connect("Python\\BancoDeDados\\BD2\\banco.bd")
        cursor = conexao.cursor()
        try:
         comando0 = '''
                     CREATE TABLE IF NOT EXISTS Locais(
                     id INTEGER PRIMARY KEY AUTOINCREMENT,
                     nome TEXT NOT NULL,
                     endereco TEXT NOT NULL
                     );
                    '''
         
         cursor.execute(comando0)
      
         comando1 = '''
                    CREATE TABLE IF NOT EXISTS Eventos(
                     id INTEGER PRIMARY KEY AUTOINCREMENT,
                     nome TEXT NOT NULL,
                     data TEXT NOT NULL,
                     local_id INTEGER NOT NULL,
                     FOREIGN KEY(local_id) REFERENCES Locais(id)
                    );
                    '''
         cursor.execute(comando1)
       
         comando2 = '''
                    CREATE TABLE IF NOT EXISTS Participantes(
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome TEXT NOT NULL,
                    email TEXT NOT NULL,
                    evento_id INTEGER NOT NULL,
                    FOREIGN KEY(evento_id) REFERENCES Eventos(id))
                    '''
         cursor.execute(comando2)
         conexao.commit()
        except conector.ProgrammingError as err:
           print("Comandos SQL invalidos, tente novamente!", err)
        finally:
           cursor.close()
    except conector.DatabaseError as err:
        print("Parece que nao conseguimos nos conectar no Banco de Dados!", err)
    finally:
        conexao.close()
    return print("Banco de dados criado!")



if __name__ == "__main__":
   criarBD()


      