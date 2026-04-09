import java.util.ArrayList;
import java.util.List;

// GoodsBogie class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular / Open
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TRAINMANAGEMENTAPP {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));             // valid
        bogies.add(new GoodsBogie("Box", "Grain"));             // valid

        // ❗ Uncomment below to test invalid case
        // bogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid

        // -------------------------------
        // SAFETY VALIDATION USING STREAM
        // -------------------------------
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        // -------------------------------
        // OUTPUT
        // -------------------------------
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nSafety Status: " + (isSafe ? "SAFE ✅" : "UNSAFE ❌"));

        System.out.println("\nProgram completed...");
    }
}