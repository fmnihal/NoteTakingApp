import java.util.Scanner;
public class DeleteNote {
    static void deleteNote() {
        Scanner scanner = new Scanner(System.in);

        if (NoteTakingApp.notes.isEmpty()) {
            System.out.println("No notes available to delete.");
            return;
        }

        System.out.println("Enter the number of the note you want to delete:");
        int noteNumber = scanner.nextInt();

        if (noteNumber >= 1 && noteNumber <= NoteTakingApp.notes.size()) {
            String deletedNote = NoteTakingApp.notes.remove(noteNumber - 1);
            System.out.println("Note deleted successfully: " + deletedNote);
        } else {
            System.out.println("Invalid note number. No note deleted.");
        }
    }
}
