import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate
        System.out.println("Bogie IDs added (duplicates ignored).");
        System.out.println("Unique bogie IDs in train consist: " + bogieIDs);
        System.out.println("Application is ready for further operations.");
    }
}
