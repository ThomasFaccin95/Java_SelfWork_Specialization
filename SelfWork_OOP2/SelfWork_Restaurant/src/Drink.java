public class Drink {
    // Attributi
    private String nome;
    private double prezzo;
  

    // Costruttore
    public Drink(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        
    }

    // GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

   
}