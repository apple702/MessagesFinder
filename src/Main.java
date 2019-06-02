import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        //TODO read input


        int searchTimes = 0;
        int numberOfMatch = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please type words. Type -1 to exit.");

            String input = in.nextLine();

            if (input.equals("-1")) {
                break;
            }
            //TODO search

        }

        System.out.println("Summary: "  + searchTimes + " searches performed, " + numberOfMatch +  " words matched across all input files");

    }

    public List<String> readFile(String fileName) {
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
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
