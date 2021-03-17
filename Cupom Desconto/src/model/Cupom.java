package model;

import java.util.ArrayList;
import java.util.List;

public class Cupom {

    private String nomeCupom;
    private int codigo;
    private String validade;
    private double desconto;

    List<Passageiro> passageiros = new ArrayList();

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }
    public String printarCupom(){
        String print = "";
        print += "Nome do cupom = " + getNomeCupom() + "\n";
        print += "Codigo do cupom = " + getCodigo() + "\n";
        print += "Validade = " + getValidade() + "\n";
        print += "Desconto aplicado = " + getDesconto() + "\n";
        print += "\n";
        return print;
    }
    @Override
    public String toString(){
        return "\nCupom cadastrado com o codigo informado: \n" + "Nome do cupom = " + nomeCupom
                + ", Validade = " + validade + ", Desconto aplicado = " + desconto + "\n";
    }

    public String getNomeCupom() {
        return nomeCupom;
    }

    public void setNomeCupom(String nomeCupom) {
        this.nomeCupom = nomeCupom;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}