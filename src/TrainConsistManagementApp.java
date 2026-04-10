import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial train consist: " + trainConsist);
        trainConsist.add(2, "Pantry Car");
        System.out.println("Inserted Pantry Car at position 2.");
        System.out.println("Train consist after insertion: " + trainConsist);
        String removedFirst = trainConsist.removeFirst();
        String removedLast = trainConsist.removeLast();
        System.out.println("Removed first bogie: " + removedFirst);
        System.out.println("Removed last bogie: " + removedLast);
        System.out.println("Final ordered train consist: " + trainConsist);
        System.out.println("Application is ready for further operations.");
    }
}
