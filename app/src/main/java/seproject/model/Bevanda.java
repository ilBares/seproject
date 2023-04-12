package seproject.model;

public class Bevanda {
    private String nome;
    private double quantita;

    public Bevanda(String nome, double quantita) {
        this.nome = nome;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public double quantita() {
        return quantita;
    }
}
