import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());
        if (trainConsist.isEmpty()) {
            System.out.println("Current train consist: [No bogies attached]");
        } else {
            System.out.println("Current train consist: " + trainConsist);
        }
        System.out.println("Application is ready for further operations.");
    }
}
