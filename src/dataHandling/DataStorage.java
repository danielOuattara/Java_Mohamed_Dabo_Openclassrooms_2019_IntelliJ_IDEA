package dataHandling;

import java.util.*;

public class DataStorage {

    public static void main(String[] args) {

/* Use Arrays when data are fixed
   -------------------------------- */

        // way 1:
        byte[] cupsOfCoffeePerDay;  // declaration
        cupsOfCoffeePerDay = new byte[7]; // initialization

        System.out.println("cupsOfCoffeePerDay = " + Arrays.toString(cupsOfCoffeePerDay)); // to see the content of an initialized Array

        cupsOfCoffeePerDay[4] = 3;

        System.out.println(cupsOfCoffeePerDay[0]);
        System.out.println(cupsOfCoffeePerDay[1]);
        System.out.println(cupsOfCoffeePerDay[2]);
        System.out.println(cupsOfCoffeePerDay[3]);
        System.out.println(cupsOfCoffeePerDay[4]);
        System.out.println(cupsOfCoffeePerDay[5]);
        System.out.println(cupsOfCoffeePerDay[6]);

        // Way 2 :
        byte[] cupsOfCoffeePerDay2 = new byte[7]; // declaration & initialization made on the same line
        System.out.println("cupsOfCoffeePerDay2 = " + Arrays.toString(cupsOfCoffeePerDay2)); // to see the content of an initialized Array

        // Way 3:
        byte[] cupsOfCoffeePerDay3 = new byte[]{5, 2, 3, 7, 3, 4, 1};  // 3rd way
        System.out.println("cupsOfCoffeePerDay3 = " + Arrays.toString(cupsOfCoffeePerDay3)); // to see the content of an initialized Array

        // Way 4:
        int[] numbers2 = {2, 3, 5, 1, 4};

        String[][] theatreSeats = new String[2][3];
        theatreSeats[1][2] = "James Bond";
        System.out.println(Arrays.deepToString(theatreSeats));
        System.out.println("-------------------------------------------");


/* NOTE: Use collections (list & dictionary) when data storage are dynamically evolving:
         --------------------------------------------------------------------------------*/

        /* ArrayList: A list can only store Object not primitives. So Integer and not int !
         ---------------------------------------------------------------------------------*/

        ArrayList<Integer> integersList = new ArrayList<>();
        List<Character> charactersList = new ArrayList<Character>();
        List<Boolean> booleansList = new ArrayList<Boolean>();
        List<Byte> bytesList = new ArrayList<Byte>();
        List<Long> longsList = new ArrayList<Long>();
        List<Float> floatsList4 = new ArrayList<Float>();
        List<Double> doublesList = new ArrayList<Double>();
        List<String> stringList = new ArrayList<String>();


        integersList.add(7); // -- >[7]
        integersList.add(5); // -- >[7,5]
        integersList.add(1, 12);
        integersList.add(-6);
        integersList.add(-90);
        System.out.println("integersList = " + integersList);
        System.out.println("firstList1_size = " + integersList.size());

        integersList.set(0, 2);
        integersList.set(4, 9);
        System.out.println("integersList = " + integersList);
        System.out.println("firstList1_size = " + integersList.size());

        int removedAt4 = integersList.remove(4);
        System.out.println("removedAt4 = " + removedAt4);

        int removedAt3 = integersList.remove(3);
        System.out.println("removedAt3 = " + removedAt3);

        System.out.println("integersList = " + integersList);
        System.out.println("firstList1_size = " + integersList.size());
        System.out.println("-------------------------------------------");

        // TP :
        //TODO Remplacez ?? par le code correct pour crééer une liste de type String
        List<String> guests = new ArrayList<String>();

        //TODO Ajoutez Joey, Martin et Marie à la liste
        guests.add("Joey");
        guests.add("Martin");
        guests.add("Marie");

        //TODO Complétez l'instruction en remplaçant ?? pour afficher la taille de la liste
        System.out.println(guests.size());

        //TODO Remplacez Martin par John dans la liste
        guests.set(1, "John");

        //TODO Retirez Joey de la liste
        guests.remove(0);

        //Affiche le contenu de la liste
        System.out.println("The guests are:");
        for (String guest : guests) {
            System.out.println(guest);
        }
        System.out.println("The same guests are : " + guests);
        System.out.println("-------------------------------------------");


        /* Sets ( unordered sets of elements)
        -----------------------------------------
         --> add , remove, size. No "easy" access to an element */

        Set<String> ingredients = new HashSet<>();
        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");
        System.out.println("ingredients = " + ingredients);
        System.out.println("ingredients-size = " + ingredients.size());

        ingredients.remove("butter");
        ingredients.remove("salt");
        System.out.println("ingredients = " + ingredients);
        System.out.println("ingredients-size = " + ingredients.size());

        Set<String> ingredients2 = new HashSet<>();
        ingredients2.add("sugar");
        ingredients2.add("chocolate");
        ingredients2.add("butter");
        ingredients2.add("vanilla");


        // TP:
        //TODO Ajoutez un autre ingrédient à l'ensemble
        ingredients2.add("farine");
        //TODO Supprimez la vanille
        ingredients2.remove("vanille");

        //Affiche le résultat de l'ensemble
        System.out.println("Here is our ingredients2 list");
        for (String ingredient : ingredients2) {
            System.out.println(ingredient);
        }
        System.out.println("-------------------------------------------");


        /* Maps
        -------*/

        Map<String, Integer> myMap1 = new HashMap<String, Integer>();
        myMap1.put("Jenny", 32);
        myMap1.put("Livia", 28);
        myMap1.put("Paul", 31);
        System.out.println("myMap1 =" + myMap1);
        System.out.println("jenny a : " + myMap1.get("Jenny"));


        Map<String, String> professionId = new HashMap<String, String>();
        professionId.put("Jenny", "Business Owner");
        System.out.println("Jenny works as: " + professionId.get("Jenny"));

        professionId.put("Jenny", "Developer");
        System.out.println("Jenny works as: " + professionId.get("Jenny"));

        professionId.remove("Jenny");
        System.out.println("professionId =" + professionId);

        System.out.println("-------------------------------------------");


        // TP:

        Map<String, Integer> months = new HashMap<String, Integer>();

        //TODO Remplacez les variables par des constantes
        final String kJune = "june";
        final String kSeptembre = "septembre";
        final String kMarch = "march";
        months.put(kJune, 6);
        months.put(kSeptembre, 9);
        months.put(kMarch, 5);

        //TODO Corrigez "march" (mars) par sa vraie valeur (3)
        months.put(kMarch, 3);

        //TODO Supprimez "june" (juin)
        months.remove(kJune);

        //Affiche le contenu du dictionnaire
        System.out.println("Here are some interesting months");
        for (Map.Entry<String, Integer> month : months.entrySet()) {
            System.out.println(month.getKey() + " is month number " + month.getValue() + " of the year ");
        }
    }
}
