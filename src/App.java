
/* DEVELOPERS: Audra Segura, Sadia Firdous
 * DATE: 11-15-2025
 * DESCRIPTION: Create a display of planets, their sizes, distances,number of moons they have, and the description of the planets.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Create a file for the planet information text file
        File planets = new File("planets.txt");

        // Create scanner which reads file line by line
        Scanner sc = new Scanner(planets);

        // Store full Lines from the planets.txt file
        ArrayList<String> fullLine = new ArrayList<String>();

        // Read all the lines from the planets.txt file
        while (sc.hasNextLine()) {
            fullLine.add(sc.nextLine());
        }

        // Create arrays to store all the information of planets
        String[] planetNames = new String[fullLine.size()];
        String[] planetSizes = new String[fullLine.size()];
        double[] planetDistances = new double[fullLine.size()];
        int[] planetMoons = new int[fullLine.size()];
        String[] planetDescriptions = new String[fullLine.size()];

        // int count = splitLines(fullLine, 0).length;
        for (int h = 1; h < fullLine.size(); h++) {
            planetNames[h - 1] = splitLines(fullLine, h)[0];
            planetSizes[h - 1] = splitLines(fullLine, h)[1];
            planetDistances[h - 1] = Double.valueOf(splitLines(fullLine, h)[2]);
            planetMoons[h - 1] = Integer.valueOf(splitLines(fullLine, h)[3]);
            planetDescriptions[h - 1] = splitLines(fullLine, h)[4];

            System.out.printf("\n\n%-20s %s%-20s %.1f %-30s %d %-10s \nDescription: %s\n\n",
                    (planetNames[h - 1] + ":"), "Size ", planetSizes[h - 1], planetDistances[h - 1],
                    "inches from the sun", planetMoons[h - 1], "moons",
                    planetDescriptions[h - 1]);
        }

        // Scanner cs = new Scanner(System.in);
        // System.out.println("Enter any numbers (1 - 5): ");

        // int option = cs.nextInt();;

        // switch (option) {
        // case 1:
        // printPlanets(planetNames, planetSizes, planetDistances, planetMoons,
        // planetDescriptions);
        // break;

        // }
        // :

    }

    public static String[] splitLines(ArrayList<String> fullLine, int i) {

        // Split all the words using comma
        String separate = "[,]";
        String[] parameterCount = fullLine.get(0).split(separate);
        String[] oneLine = new String[parameterCount.length];

        // Split the line i and then store that in oneLine
        oneLine = fullLine.get(i).split(separate);

        // Return the information of the split
        return oneLine;
    }

}
