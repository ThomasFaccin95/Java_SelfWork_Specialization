package SelfWork_Java;
public class SelfWork_4 {
    public static void main (String[] args) {
      
        int[] numeri = {20,40,100,250,500};

        int massimo = numeri[0];
        //Per controllare se il numero è maggiore del massimo, se è vero allora il numero diventa il nuovo massimo
        for (int i = 1; i < numeri.length; i++) {
            //Controllo se il numero è maggiore del massimo
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        System.out.println("Il numero più grande è: " + massimo);
    }

}