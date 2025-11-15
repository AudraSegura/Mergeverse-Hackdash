
/* DEVELOPERS: Audra Segura, Sadia Firdous
 * DATE: 11-15-2025
 * DESCRIPTION: 
 */
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File planets = new File("planets.txt");

        if (!planets.exists()) {
            System.out.println("File not found!");
            return;
        }
        if (planets.length() == 0) {
            System.out.println("File is empty!");
            return;
        }
        Scanner sc = new Scanner(planets);

        System.out.println("Working directory: " + System.getProperty("user.dir"));
        System.out.println("testing print");
        System.out.println(sc.hasNextLine());

        while (sc.hasNextLine()) {
            // System.out.println(sc.hasNextLine());
            String test = sc.nextLine();
            System.out.println("testing print in while loop");
            System.out.println(test);
        }

    }
}
