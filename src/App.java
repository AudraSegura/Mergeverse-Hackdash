
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

        File planets = new File("planets.txt");

        Scanner sc = new Scanner(planets);

    

    public static String [] ()
        
        ArrayList<String> fullLine = new ArrayList<String>();

  
        
        while (sc.hasNextLine()) {
            fullLine.add(sc.nextLine());

        }
    

    public static 

        String separate = "[,]";
        String [] parameterCount = fullLine.get(0).split(separate);
        String [] oneLine = new String [parameterCount.length];

        for (int i = 0; i < fullLine.size(); i++) {
           oneLine = fullLine.get(i).split(separate);

        }

        for (String element : oneLine) {
            System.out.println(element);
        }

    }
}