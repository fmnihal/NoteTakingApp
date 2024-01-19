import java.util.Scanner;

public class EditNote implements NoteAction {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        if (NoteTakingApp.notes.isEmpty()) {
            System.out.println("No notes available to edit.");
            return;
        }

        System.out.println("Enter the number of the note you want to edit:");
        int noteNumber = scanner.nextInt();

        if (noteNumber >= 1 && noteNumber <= NoteTakingApp.notes.size()) {
            scanner.nextLine(); // Consume the newline character
            String existingContent = NoteTakingApp.notes.get(noteNumber - 1);

            System.out.println("Edit contents on the note: " + existingContent);
            String newContent = scanner.nextLine(); // Read the actual content
            existingContent += " " + newContent;
            NoteTakingApp.notes.set(noteNumber - 1, existingContent);
            System.out.println("Note edited successfully.");
        } else {
            System.out.println("Invalid note number. No note edited.");
        }
    }
}
