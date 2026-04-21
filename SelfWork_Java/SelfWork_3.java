package SelfWork_Java;
public class SelfWork_3 {
    public static void main (String[] args) {
      
        String[] nomi={"Thomas", "Xhony", "Luca", "Davide", "Marco"};
    
        System.out.println( "Nome in posizione pari");

        for (int i=0; i<nomi.length; i++){
          if (i%2==0){
            System.out.println(nomi[i]);
          }
        }

    }

}