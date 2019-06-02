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

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<List<String>> sourse = new ArrayList<>();
        for (String s : fileNames) {
            sourse.add(readFile(s));
        }

        while (true) {

            System.out.println("Please type a word,  \"- 1\" to exit:");

            String input = in.nextLine();

            if (input.equals("-1")) {
                break;
            }

            searchTimes++;
            int currMatch = 0;
            for (List<String> list : sourse) {
                for (String s : list) {
                    if (s.contains(input)) {
                        System.out.println("Matching message is \"" + s + "\". Matching word is \"" + input.toUpperCase() + "\"");
                        currMatch++;
                    }
                }
            }
            if (currMatch == 0)
                System.out.println("No words found");

            numberOfMatch += currMatch;
        }

        System.out.println("Summary: " + searchTimes + " searches performed, " + numberOfMatch + " words matched across all input files");

    }

    public static List<String> readFile(String fileName) {
        File file = new File(fileName);
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        try {
            Reader reader = new InputStreamReader(new FileInputStream(file));
            int tempChar;

            while (true) {
                if ((tempChar = reader.read()) == -1) {
                    list.add(sb.toString());
                    break;
                }

                if ((char)tempChar == '\n') {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
                else {
                    sb.append((char)tempChar);
                }
            }

            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}


