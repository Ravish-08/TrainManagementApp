import java.util.ArrayList;
import java.util.List;

public class TRAINMANAGEMENTAPP {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (List of bogies)
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train consist initialized.");

        // Display initial bogie count
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Continue program
        System.out.println("Program ready for further operations...");
    }
}