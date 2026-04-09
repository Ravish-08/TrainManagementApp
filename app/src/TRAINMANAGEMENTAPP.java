import java.util.*;

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

        // CREATE LIST OF BOGIES
        List<BOGIE> BOGIES = new ArrayList<>();

        BOGIES.add(new BOGIE("SLEEPER", 72));
        BOGIES.add(new BOGIE("AC CHAIR", 60));
        BOGIES.add(new BOGIE("FIRST CLASS", 50));
        BOGIES.add(new BOGIE("SLEEPER", 80));
        BOGIES.add(new BOGIE("AC CHAIR", 75));

        // 🔹 STREAM + MAP + REDUCE
        int TOTALSEATS = BOGIES.stream()
                .map(B -> B.GETCAPACITY())
                .reduce(0, Integer::sum);

        // DISPLAY OUTPUT
        System.out.println("TOTAL SEATING CAPACITY: " + TOTALSEATS);
    }
}