package seproject.model;

public class Ingrediente {
    private String nome;
    private double quantita;
    private String unitaMisura;

    public Ingrediente(String nome, double quantita, String unitaMisura) {
        this.nome = nome;
        this.quantita = quantita;
        this.unitaMisura = unitaMisura;
    }

    public String getNome() {
        return this.nome;
    }

    public double getQuantita() {
        return this.quantita;
    }

    public String getUnitaMisura() {
        return this.unitaMisura;
    }
}
