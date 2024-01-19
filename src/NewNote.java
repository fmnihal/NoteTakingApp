import java.util.Scanner;

public class NewNote implements NoteAction {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your note:");
        String note = scanner.nextLine();
        NoteTakingApp.notes.add(note);
        System.out.println("Note added successfully!");
    }
}









//import java.util.ArrayList;
//import java.util.Scanner;
//public class NewNote {
//    static void newNote() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your note:");
//        String note = scanner.nextLine();
//        NoteTakingApp.notes.add(note);
//        System.out.println("Note added successfully!");
//    }
//}
