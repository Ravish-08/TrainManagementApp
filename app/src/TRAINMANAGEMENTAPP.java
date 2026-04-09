import java.util.*;
import java.util.stream.Collectors;

class BOGIE {
    String TYPE;
    int CAPACITY;

    public BOGIE(String TYPE, int CAPACITY) {
        this.TYPE = TYPE;
        this.CAPACITY = CAPACITY;
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

        // LIST OF BOGIES (FROM UC7)
        List<BOGIE> BOGIES = new ArrayList<>();

        BOGIES.add(new BOGIE("SLEEPER", 72));
        BOGIES.add(new BOGIE("AC CHAIR", 60));
        BOGIES.add(new BOGIE("FIRST CLASS", 50));
        BOGIES.add(new BOGIE("SLEEPER", 80));
        BOGIES.add(new BOGIE("AC CHAIR", 75));

        // STREAM FILTER (CAPACITY > 60)
        List<BOGIE> FILTEREDBOGIES = BOGIES.stream()
                .filter(B -> B.GETCAPACITY() > 60)
                .collect(Collectors.toList());

        // DISPLAY OUTPUT
        System.out.println("FILTERED BOGIES (CAPACITY > 60):");

        if (FILTEREDBOGIES.isEmpty()) {
            System.out.println("NO BOGIES MATCH THE CRITERIA.");
        } else {
            FILTEREDBOGIES.forEach(System.out::println);
        }
    }
}