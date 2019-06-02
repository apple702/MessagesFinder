import java.util.*;

public class Main {

    public static void main(String[] args) {
        //TODO read input


        int searchTimes = 0;
        int numberOfMatch = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please type words");

            String input = in.nextLine();

            if (input.equals("-1")) {
                break;
            }
            //TODO search

        }

        System.out.println("Summary: "  + searchTimes + " searches performed, " + numberOfMatch +  " words matched across all input files");

    }
}
