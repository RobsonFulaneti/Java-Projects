package model;

import java.util.ArrayList;
import java.util.List;

public class VelhoTestamento {
    private List<String> livrosVelho = new ArrayList<>();

    @Override
    public String toString() {
        return "VelhoTestamento{" +
                "livrosVelho=" + livrosVelho +
                '}';
    }

    public List<String> getLivrosVelho() {
        return livrosVelho;
    }

    public void setLivrosVelho(List<String> livrosVelho) {
        this.livrosVelho = livrosVelho;
    }
}
