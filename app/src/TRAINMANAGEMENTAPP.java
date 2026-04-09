import java.util.*;
import java.util.stream.Collectors;

class BOGIE {
    String TYPE;
    int CAPACITY;

    public BOGIE(String TYPE, int CAPACITY) {
        this.TYPE = TYPE;
        this.CAPACITY = CAPACITY;
    }

    public String GETTYPE() {
        return TYPE;
    }

    public int GETCAPACITY() {
        return CAPACITY;
    }

    @Override
    public String toString() {
        return "BOGIE TYPE: " + TYPE + ", CAPACITY: " + CAPACITY;
    }
}

public class TRAINMANAGEMENTAPP {

    public static void main(String[] args) {

        // LIST OF BOGIES (REUSE FROM UC8)
        List<BOGIE> BOGIES = new ArrayList<>();

        BOGIES.add(new BOGIE("SLEEPER", 72));
        BOGIES.add(new BOGIE("AC CHAIR", 60));
        BOGIES.add(new BOGIE("FIRST CLASS", 50));
        BOGIES.add(new BOGIE("SLEEPER", 80));
        BOGIES.add(new BOGIE("AC CHAIR", 75));

        // 🔹 GROUPING USING STREAM API
        Map<String, List<BOGIE>> GROUPEDBOGIES = BOGIES.stream()
                .collect(Collectors.groupingBy(B -> B.GETTYPE()));

        // 🔹 DISPLAY GROUPED RESULT
        System.out.println("GROUPED BOGIES BY TYPE:");

        if (GROUPEDBOGIES.isEmpty()) {
            System.out.println("NO BOGIES AVAILABLE.");
        } else {
            for (Map.Entry<String, List<BOGIE>> ENTRY : GROUPEDBOGIES.entrySet()) {
                System.out.println("\nTYPE: " + ENTRY.getKey());
                ENTRY.getValue().forEach(System.out::println);
            }
        }
    }
}