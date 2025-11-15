
/* DEVELOPERS: Audra Segura, Sadia Firdous
 * DATE: 11-15-2025
 * DESCRIPTION: 
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Create a file for planets
        File planets = new File("planets.txt");

        // Create scanner which reads file line by line
        Scanner sc = new Scanner(planets);

        int i = 0;

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
            planetNames[h] = splitLines(fullLine, h)[0];
            planetSizes[h] = splitLines(fullLine, h)[1];
            planetDistances[h] = Double.valueOf(splitLines(fullLine, h)[2]);
            planetMoons[h] = Integer.valueOf(splitLines(fullLine, h)[3]);
            planetDescriptions[h] = splitLines(fullLine, h)[4];
            System.out.println(planetNames[h] + ", " + planetSizes[h] + ", " +
                    planetDistances[h] + ", "
                    + planetMoons[h] + ", " + planetDescriptions[h]);
        }

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
