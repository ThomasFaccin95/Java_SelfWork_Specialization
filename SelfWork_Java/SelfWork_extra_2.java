package SelfWork_Java;
public class SelfWork_extra_2 {
    public static void main(String[] args) {

        String parola = "Ciao, siamo tutti online";

        boolean trovate = false;
        String vocali = "aeiouAEIOU";


        for (int i = 0; i < parola.length() - 1; i++) {

            char carattereCorrente = parola.charAt(i);
            char carattereSuccessivo = parola.charAt(i + 1);

            // Controlliamo se entrambi i caratteri sono vocali
            if (vocali.indexOf(carattereCorrente) != -1 && vocali.indexOf(carattereSuccessivo) != -1) {
                trovate = true;
                System.out.println("Trovata una coppia di vocali: " + carattereCorrente + carattereSuccessivo);
                break; 
            }
        }

        if (trovate) {
            System.out.println("La stringa contiene due vocali consecutive.");
        } else {
            System.out.println("La stringa NON contiene due vocali consecutive.");
        }

    }

}
