package model;

public class Produto {
    private int id;
    private String nome;
    private Double valor;

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nome + '\'' +
                ", valor=" + valor +
                ", id=" + id +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
