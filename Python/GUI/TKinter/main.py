import tkinter as tk
from tkinter import messagebox


def submit():
   nome = nome_entry.get()
   email =  email_entry.get()
   linguagem = linguagem_favorita_var.get()
   print(f"Nome:{nome}\nEmail:{email}\nLinguagem Favorita:{linguagem}")

   #agora vamos exibir isso no proprio app
   messagebox.showinfo("INFORMACOES",
                        f"Nome: {nome}\nEmail: {email}\nLinguagem Favorita: {linguagem}")




#criando o principal 
janelaPrincipal = tk.Tk()
janelaPrincipal.title("APP Principal")

#criando o frame principal para os widgets
framePrincipal = tk.Frame(janelaPrincipal)
framePrincipal.pack(padx= 10, pady=10)

#criando os widgets (nome, email e linguagem favorita)

nome_label = tk.Label(framePrincipal, text="Nome")
nome_label.grid(row= 0, column= 0, sticky="e")

nome_entry = tk.Entry(framePrincipal)
nome_entry.grid(row = 0, column= 1)


email_label = tk.Label(framePrincipal, text="Email")
email_label.grid(row= 1, column= 0, sticky="e")

email_entry = tk.Entry(framePrincipal)
email_entry.grid(row=1, column= 1)

linguagem_favorita_var = tk.StringVar(value="Python")

escolha1 = tk.Radiobutton(framePrincipal, text="Python", variable=linguagem_favorita_var,
                          value="Python")
escolha1.grid(row= 2, column= 0)

escolha2 = tk.Radiobutton(framePrincipal, text="Java", variable=linguagem_favorita_var,
                          value= "Java")
escolha2.grid(row=2, column=1)


#agora vamos criar o botao para enviar todas as informacoes e depois iremos criar a funcao que nos mostrara essas respostas

botaoConfirmar = tk.Button(framePrincipal, text="Enviar", command=submit)
botaoConfirmar.grid(row=3, columnspan=2, column=0)


#instanciando o app para que ele funcione
janelaPrincipal.mainloop()