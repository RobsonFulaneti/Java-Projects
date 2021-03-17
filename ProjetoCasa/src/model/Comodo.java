package model;

import java.util.ArrayList;
import java.util.List;

public class Comodo {
    private int id;
    private String nome;
    private List<Movel> moveis = new ArrayList<>();//Dentro do comodo, vai existir varios moveis

    @Override
    public String toString() {
        return "Comodo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", moveis=" + moveis +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Movel> getMoveis() {
        return moveis;
    }

    public void setMoveis(List<Movel> moveis) {
        this.moveis = moveis;
    }
}
