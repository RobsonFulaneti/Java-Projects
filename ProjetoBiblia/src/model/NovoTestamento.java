package model;

import java.util.ArrayList;
import java.util.List;

public class NovoTestamento {
    private List<String> livrosNovo = new ArrayList<>();

    @Override
    public String toString() {
        return "NovoTestamento{" +
                "livrosNovo=" + livrosNovo +
                '}';
    }

    public List<String> getLivrosNovo() {
        return livrosNovo;
    }

    public void setLivrosNovo(List<String> livrosNovo) {
        this.livrosNovo = livrosNovo;
    }
}
