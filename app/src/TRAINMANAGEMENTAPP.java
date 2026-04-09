import java.util.*;
import java.util.regex.*;

public class TRAINMANAGEMENTAPP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // INPUT FROM USER
        System.out.print("ENTER TRAIN ID: ");
        String TRAINID = sc.nextLine();

        System.out.print("ENTER CARGO CODE: ");
        String CARGOCODE = sc.nextLine();

        // REGEX PATTERNS
        String TRAIN_PATTERN = "TRN-\\d{4}";
        String CARGO_PATTERN = "PET-[A-Z]{2}";

        // COMPILE PATTERN
        Pattern trainPattern = Pattern.compile(TRAIN_PATTERN);
        Pattern cargoPattern = Pattern.compile(CARGO_PATTERN);

        // MATCHER
        Matcher trainMatcher = trainPattern.matcher(TRAINID);
        Matcher cargoMatcher = cargoPattern.matcher(CARGOCODE);

        // VALIDATION
        if (trainMatcher.matches()) {
            System.out.println("TRAIN ID IS VALID");
        } else {
            System.out.println("INVALID TRAIN ID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("CARGO CODE IS VALID");
        } else {
            System.out.println("INVALID CARGO CODE");
        }

        sc.close();
    }
}