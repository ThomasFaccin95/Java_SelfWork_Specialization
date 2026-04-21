public class SelfWork_5 {
    public static void main(String[] args) {

        int[] numeri = {10, 20, 40}; 

        int dimensione = numeri.length;

        int somma = 0;

        for (int numero : numeri) {
            somma = somma + numero;
        }

        System.out.println("Hai inserito nel codice " + dimensione + " numeri.");
        System.out.println("La somma Totale è: " + somma);
    }
}