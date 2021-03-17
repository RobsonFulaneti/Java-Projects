package model;

public class Movel {
    private String nome;
    private int idMovel;

    @Override
    public String toString() {
        return "Movel{" +
                "nome='" + nome + '\'' +
                ", id=" + idMovel +
                '}';
    }

    public int getIdMovel() {
        return idMovel;
    }

    public void setIdMovel(int idMovel) {
        this.idMovel = idMovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
