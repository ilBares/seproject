package seproject.model;

public abstract class ItemExtra {
    private String nome;
    private double quantita;

    public ItemExtra(String nome, double quantita) {
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
