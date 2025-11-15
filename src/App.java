
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

        int i = 0;
        ArrayList<String> fullLine = new ArrayList<String>();

        while (sc.hasNextLine()) {
            fullLine.add(sc.nextLine());
        }

        String[] planetNames = new String[fullLine.size()];
        String[] planetSizes = new String[fullLine.size()];
        double[] planetDistances = new double[fullLine.size()];
        int[] planetMoons = new int[fullLine.size()];
        String[] planetDescriptions = new String[fullLine.size()];

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

        String separate = "[,]";
        String[] parameterCount = fullLine.get(0).split(separate);
        String[] oneLine = new String[parameterCount.length];

        oneLine = fullLine.get(i).split(separate);
        return oneLine;
    }

}
