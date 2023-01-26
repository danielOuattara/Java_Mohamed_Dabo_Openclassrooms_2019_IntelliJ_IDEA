
package cleanHello;

/**
 * Ceci est une implémentation du message traditionnel "Hello world!"
 *
 * @author L'équipe Education d'OpenClassrooms
 */

public class CleanHelloWorld {
    public static void main(String[] args) {
        sayHelloTo("World");
    }
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient + " !");
    }

}