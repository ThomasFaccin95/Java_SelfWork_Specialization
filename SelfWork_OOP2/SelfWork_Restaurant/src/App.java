public class App {
    public static void main(String[] args) {
        
       
        Dish[] Dishes = {
            new Dish("Pasta al pomodoro", 8.50, "Pasta, pomodori freschi, basilico", Category.Primo),
            new Dish("Risotto di mare", 14.00, "Riso, cozze, vongole, calamari", Category.Primo),
            new Dish("Saltimbocca", 12.00, "Vitello, prosciutto crudo, salvia", Category.Secondo),
            new Dish("Tiramisù", 10.00, "Mascarpone, caffè, savoiardi, cacao", Category.Dolce)
        };

        Drink[] Drinks = {
            new Drink("Acqua Naturale", 2.00),
            new Drink("Coca Cola", 3.50),
            new Drink("Vino Bianco", 15.00)
        };

        Restaurant restaurant = new Restaurant("La Forchetta Felice", Dishes, Drinks);

       
        restaurant.printMenu();
    }
}