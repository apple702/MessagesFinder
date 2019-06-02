import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int searchTimes = 0;
        int numberOfMatch = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please type file names:");
        String path = in.nextLine();
        File file = new File(path);
        ArrayList<String> fileNames = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String fileName = null;
            while ((fileName = reader.readLine()) != null) {
                fileName = fileName.trim();
                fileNames.add(fileName);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        while (true) {
            System.out.println("Please type a word,  \"- 1\" to exit:");

            String input = in.nextLine();

            if (input.equals("-1")) {
                break;
            }
            //TODO search

        }

        System.out.println("Summary: " + searchTimes + " searches performed, " + numberOfMatch + " words matched across all input files");

    }
}


