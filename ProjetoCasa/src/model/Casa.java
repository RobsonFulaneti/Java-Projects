package model;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private int idCasa;
    private List<Comodo> comodos = new ArrayList<>();//Dentro da casa, vai existir varios comodo

    @Override
    public String toString() {
        return "Casa{" +
                "num=" + idCasa +
                ", comodos=" + comodos +
                '}';
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodo> comodos) {
        this.comodos = comodos;
    }
}
