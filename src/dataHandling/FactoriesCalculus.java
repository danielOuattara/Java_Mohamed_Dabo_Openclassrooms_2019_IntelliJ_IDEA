package dataHandling;

public class FactoriesCalculus {

    public static void main(String[] args) {

        sommation1(0,10);
        sommation2(0,10);
        productFunction(1, 5);
    }

    public static void sommation1(int valeurInitial, int valeurFinale) {
        int somme = 0;
        int compteur = 0;

        for (compteur = valeurInitial; compteur < valeurFinale; compteur++) {
            somme += compteur;
            System.out.println("i = " + compteur + ", somme = " + somme);
        }
        System.out.println("---------------------------------");
    }

    public static void sommation2(int valeurInitial, int valeurFinale) {
        int somme = 0;
        int compteur = 0;

        for (compteur = valeurInitial; compteur < valeurFinale; compteur++) {
            somme += compteur;
            System.out.println("i = " + compteur + ", somme = " + somme);
        }
        System.out.println("---------------------------------");
    }

    public static void productFunction(int valeurInitial, int valeurFinal) {
        int productSortie = valeurFinal;
        int compteur = valeurInitial;
        while (compteur < valeurFinal) {
            productSortie = productSortie * (valeurFinal - compteur);
            compteur++;
            System.out.println("i = " + compteur + ", somme = " + productSortie);
        }


    }

}







