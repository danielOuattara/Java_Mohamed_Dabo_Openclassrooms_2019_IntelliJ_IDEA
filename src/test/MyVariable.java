package test;

public class MyVariable {

    public static void main(String[] args) {

        /* declaration de variables
        * -------------------------- */
        int ongoingAllowance = 200;  //Déclarez la variable int ongoingAllowance
        int savings = 3000;  //Déclarez la variable int savings
        int bonusAllowance = 500; //TODO : Déclarez une variable int nommée bonusAllowance avec la valeur 500

        /* Affiche le résultat
        * ---------------------*/
        System.out.println(" ongoing allowance = " + ongoingAllowance + "\n savings = " + savings + "\n bonus allowance = " + bonusAllowance);

        /* Déclaration de constantes Java
        * ---------------------------------*/
        final int numberOfWeeksdays = 7;
        final String myFavoriteFruit = "Banana";

        int numberOfPets = 1;
        String currentSeason = "Winter";

        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;

        int daysInWeek = 7;

        //TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
        firstDay += daysInWeek;

        //TODO Etape 3 : créez une constante numérique avec la nouvelle valeur de la variable firstDay
        final int startingDay = firstDay;

        // Affiche le résultat
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + startingDay);
    }

}
