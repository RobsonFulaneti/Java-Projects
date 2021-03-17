package model;

public class Passageiro {
    private String nome;
    private int celular;

    @Override
    public String toString() {
        return "Passageiro{" +
                "NomePassageiro='" + nome + '\'' +
                ", celular=" + celular +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

}
