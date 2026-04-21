package SelfWork_Java;
public class SelfWork_2 {
    public static void main(String[] args) {
        int[] numeri = { 1, 2, 3, 4, 5 };

        double sommaPari = 0;
        double sommaDispari = 0;
        double sommaTotale = 0;

        int contatorePari = 0;
        int contatoreDispari = 0;

        for (int numero : numeri) {
            if (numero % 2 == 0) {
                sommaPari += numero;
                contatorePari++;
            } else {
                sommaDispari += numero;
                contatoreDispari++;
            }
            sommaTotale += numero;
        }

        double mediaPari = sommaPari / contatorePari;
        double mediaDispari = sommaDispari / contatoreDispari;
        double mediaTotale = sommaTotale / numeri.length;

        System.out.println("La media dei numeri pari è: " + mediaPari);
        System.out.println("La media dei numeri dispari è: " + mediaDispari);
        System.out.println("La media totale è: " + mediaTotale);

    }
}