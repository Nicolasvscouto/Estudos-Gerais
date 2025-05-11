package projetos.criarConta;

public class CriarConta {
    private String nome;
    private String email;
    private int idade;
    private String CPF;

    public CriarConta(String nome, String email, int idade, String CPF){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.CPF = CPF;
    }

    public CriarConta(){
        
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCPF(){
        return this.CPF;
    }
    
}
