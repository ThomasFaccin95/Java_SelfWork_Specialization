public class Dish {
    // Attributi
    private String nome;
    private double prezzo; 
    private String ingredienti; 
    private Category categoria;

    // Costruttore
    public Dish(String nome, double prezzo, String ingredienti, Category categoria) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
        this.categoria = categoria;
    }

    //  GETTER E SETTER 
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

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }
}