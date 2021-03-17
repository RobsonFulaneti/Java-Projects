package model;

public class Time {
    private String nomeTime;
    private String paisTime;
    private int titulosNacionais;
    private int titulosContinentais;
    private int titulosMundiais;
    private int idTime;

    public String printarTime() {
        String print = "";
        print += "Nome time: " + getNomeTime() + "\n";
        print += "País do time: " + getPaisTime() + "\n";
        print += "Titulos Nacionais: " + getTitulosNacionais() + "\n";
        print += "Titulos Continentais: " + getTitulosContinentais() + "\n";
        print += "Titulos mundiais: " + getTitulosMundiais() + "\n";
        print += "Id de identificação do time: " + getIdTime() + "\n";
        print += "\n";
        return print;
    }

    public int getIdTime() {

        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {

        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {

        this.nomeTime = nomeTime;
    }

    public String getPaisTime() {

        return paisTime;
    }

    public void setPaisTime(String paisTime) {

        this.paisTime = paisTime;
    }

    public int getTitulosNacionais() {

        return titulosNacionais;
    }

    public void setTitulosNacionais(int titulosNacionais) {

        this.titulosNacionais = titulosNacionais;
    }

    public int getTitulosContinentais() {

        return titulosContinentais;
    }

    public void setTitulosContinentais(int titulosContinentais) {

        this.titulosContinentais = titulosContinentais;
    }

    public int getTitulosMundiais() {

        return titulosMundiais;
    }

    public void setTitulosMundiais(int titulosMundiais) {

        this.titulosMundiais = titulosMundiais;
    }

}
