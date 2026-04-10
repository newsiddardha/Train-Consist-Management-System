import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("Passenger bogies added.");
        System.out.println("Current train consist: " + passengerBogies);
        passengerBogies.remove("AC Chair");
        System.out.println("Removed bogie: AC Chair");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train consist.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }
        System.out.println("Final train consist: " + passengerBogies);
        System.out.println("Application is ready for further operations.");
    }
}
