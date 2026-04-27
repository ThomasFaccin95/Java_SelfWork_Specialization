public class Restaurant {
   
    private String name;
    private Dish[] dishes; 
    private Drink[] drinks; 

    
    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    // Metodo per stampare il menù
    public void printMenu() {
        System.out.println("=== MENU DEL RISTORANTE : " + name + " ===");
        
        System.out.println("\n -- PIATTI -- ");
        // Ciclo FOR per passare in rassegna tutti i piatti nell'array
        for (int i = 0; i < dishes.length; i++) {
            // Usiamo i Getter per leggere le informazioni!
            System.out.println("- " + dishes[i].getCategoria() + " : " + dishes[i].getNome() + " | " + dishes[i].getIngredienti() + " - Prezzo: €" + dishes[i].getPrezzo());
        }

        System.out.println("\n -- BEVANDE -- ");
        // Ciclo FOR per le bevande
        for (int i = 0; i < drinks.length; i++) {
            System.out.println("- " + drinks[i].getNome() + " - Prezzo: €" + drinks[i].getPrezzo());
        }
        
        System.out.println("=========================================");
    }
}