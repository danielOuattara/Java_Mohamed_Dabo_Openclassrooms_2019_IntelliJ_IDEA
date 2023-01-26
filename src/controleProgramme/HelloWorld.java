package controleProgramme;

public class HelloWorld { // Specific salutations --> 2 lastnames !
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println("Hello " + arg + " !");
        }

 /*  -----------------------------------------------
        for (String arg : args) {
            System.out.println("Hello " + arg + " !");
        }
 */

/*    -----------------------------------------------
        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + args[i] + " !");
        }
 */
    }
}



/*
public class HelloWorld { // Simple way !

    public static void main(String[] args) {
    	System.out.println("Hello World!");
    }
}

*/
//----------------------------------------------------------
/*
public class HelloWorld { // Specific salutations --> 1 lastname !

    public static void main(String[] args) {

        if(args.length ==1) {
        	System.out.println("Hello " + args[0] + " !");
        }else{
        	System.out.println("Hello World!");
        }
    }
}
*/
// -------------------------------------------------------------
/*
public class HelloWorld { // Specific salutations --> 2 lastnames !

    public static void main(String[] args) {
        if(args.length ==1) {
        	System.out.println("Hello " + args[0] + " !");
        }

        else if (args.length == 2) {
        	System.out.println("Hello " + args[0] +" "+ args[1] + " !");
        }
        else{
        	System.out.println("Hello World!");
        }
    }
}

*/
