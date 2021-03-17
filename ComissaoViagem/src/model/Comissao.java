package model;

import java.util.ArrayList;
import java.util.List;

public class Comissao {
    private List<Passageiro> passageiros = new ArrayList<>();//Essa Comissao tem varios passageiros
    private int id;

    @Override
    public String toString() {
        return "Comissao{" +
                "passageiros=" + passageiros +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
}