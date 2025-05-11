import tkinter as tk
from tkinter import ttk
from tkinter import messagebox


#vamos criar uma funcao que mostre o nome
def showName():
    print(f"Esse e o nome digitado: {nome_entry.get()}")
    #porem, vamos mostrar tambem no proprio aplicativo
    messagebox.showinfo("NOME DIGITADO", f"Esse eh o nome digitado: {nome_entry.get()}")

janela = tk.Tk()
janela.title("App Teste Button")

frame = tk.Frame(janela)
frame.pack(padx = 10, pady = 10)

nome_label = tk.Label(frame, text="Nome")
nome_label.grid(row = 0, column= 0)

nome_entry = tk.Entry(frame)
nome_entry.grid(row = 0, column= 1)


#agora vamos testar o botao 

Botao = tk.Button(frame, width=50, text="Enviar", command=showName)
Botao.grid(row = 1, column= 0, columnspan= 4)



janela.mainloop()