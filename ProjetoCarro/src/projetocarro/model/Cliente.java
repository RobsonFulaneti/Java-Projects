package projetocarro.model;

public class Cliente {

    private String nome;
    private int CPF;
    private int idade;

    public String printarCliente() {
        String print = "";
        print += "Nome: " + getNome() + "\n";
        print += "CPF: " + getCPF() + "\n";
        print += "Idade: " + getIdade() + "\n";
        return print;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", CPF=" + CPF + ", idade=" + idade + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
