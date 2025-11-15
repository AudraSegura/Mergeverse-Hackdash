
/* DEVELOPERS: Audra Segura, Sadia Firdous
 * DATE: 11-15-2025
 * DESCRIPTION: 
 */
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        File planets = new File("planets.txt");

        Scanner sc = new Scanner(planets);

        // System.out.println("Working directory: " + System.getProperty("user.dir"));
        // System.out.println(sc.hasNextLine());

        // int lineCount = 0;

        ArrayList<String> fullLine = new ArrayList<String>();
        // ArrayList<String> cars = new ArrayList<String>();

        while (sc.hasNextLine()) {
            fullLine.add(sc.nextLine());
        }

        // System.out.println(lineCount);

        // for (int i = 0; i < lineCount; i++) {
        // fullLine[i] = sc.nextLine();
        // System.out.println(fullLine[i]);
        // }

        // ArrayList<String> oneLine = new ArrayList<String>();
        String separate = "[,]";
        String[] parameterCount = fullLine.get(0).split(separate);
        String[] oneLine = new String[parameterCount.length];

        for (int i = 0; i < fullLine.size(); i++) {
            oneLine = fullLine.get(i).split(separate);
        }

        for (String element : oneLine) {
            System.out.println(element);
        }

        // for (String element : arr) {
        // System.out.println(element);
        // }

        // System.out.println(temp);

    }
}