
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

        // int count = splitLines(fullLine, 0).length;

        for (int h = 0; h < fullLine.size(); h++) {

        }

        splitLines(fullLine, i);
        i++;

    }

    public static String[] splitLines(ArrayList<String> fullLine, int i) {

        String separate = "[,]";
        String[] parameterCount = fullLine.get(0).split(separate);
        String[] oneLine = new String[parameterCount.length];

        oneLine = fullLine.get(i).split(separate);
        return oneLine;
    }

}
