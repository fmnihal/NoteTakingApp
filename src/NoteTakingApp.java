import java.util.ArrayList;
import java.util.Scanner;

public class NoteTakingApp {
    static ArrayList<String> notes = new ArrayList<>();
    static NoteAction[] actions = {new NewNote(), new ViewNote(), new EditNote(), new NoteSize(), new DeleteNote()};

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. New Note");
            System.out.println("2. View Notes");
            System.out.println("3. Edit Additional Note");
            System.out.println("4. View Size of Notes");
            System.out.println("5. Delete Note");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                actions[choice - 1].execute();
            } else if (choice == 6) {
                System.out.println("Exiting Note Taking App. Goodbye!");
                return;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}