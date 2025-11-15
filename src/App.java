
/* DEVELOPERS: Audra Segura, Sadia Firdous
 * DATE: 11-15-2025
 * DESCRIPTION: 
 */
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File planets = new File("planets.txt");

        Scanner sc = new Scanner(planets);

        System.out.println("Working directory: " + System.getProperty("user.dir"));
        System.out.println(sc.hasNextLine());

        int lineCount = 0;
        
        while (sc.hasNextLine()) {
             sc.nextLine();
            //System.out.println(temp);


            lineCount++;



        }

        System.out.println(lineCount);

        String [] fullLine =new String [lineCount];


        for (int i = 0; i < lineCount; i++) {
            fullLine[i] = sc.nextLine();
            System.out.println(fullLine[i]);


        }

            // String separate = "[,]";

            // String[] arr = temp.split(separate);
            // for(String element : arr){
            //     System.out.println(element);
            // }

           // System.out.println(temp);
        

    }
}