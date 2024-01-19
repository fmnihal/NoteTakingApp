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












//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class NoteTakingApp {
//    static ArrayList<String> notes = new ArrayList<>();
//
//    public static void main(String[] args) {
//        while (true) {
//            System.out.println("\nSelect an option:");
//            System.out.println("1. New Note");
//            System.out.println("2. View Notes");
//            System.out.println("3. Edit Additional Note");
//            System.out.println("4. View Size of Notes");
//            System.out.println("5. Delete Note");
//            System.out.println("6. Exit");
//
//            Scanner scanner = new Scanner(System.in);
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    NewNote.newNote();
//                    break;
//                case 2:
//                    ViewNote.viewNotes();
//                    break;
//                case 3:
//                    EditNote.editNote();
//                    break;
//                case 4:
//                    NoteSize.viewNoteSize();
//                    break;
//                case 5:
//                    DeleteNote.deleteNote();
//                    break;
//                case 6:
//                    System.out.println("Exiting Note Taking App. Goodbye!");
//                    return;
//                default:
//                    System.out.println("Invalid option. Please try again.");
//                    break;
//            }
////            switch (choice) {
////                case 1:
////                    newNote();
////                    break;
////                case 2:
////                    viewNotes();
////                    break;
////                case 3:
////                    editNote();
////                    break;
////                case 4:
////                    viewNoteSize();
////                    break;
////                case 5:
////                    deleteNote();
////                    break;
////                case 6:
////                    System.out.println("Exiting Note Taking App. Goodbye!");
////                    return;
////                default:
////                    System.out.println("Invalid option. Please try again.");
////                    break;
////            }
//        }
//    }

//    static void newNote() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your note:");
//        String note = scanner.nextLine();
//        notes.add(note);
//        System.out.println("Note added successfully!");
//    }

//    static void viewNotes() {
//        System.out.println("Your Notes:");
//        if (notes.isEmpty()) {
//            System.out.println("No notes available.");
//        } else {
//            for (int i = 0; i < notes.size(); i++) {
//                System.out.println((i + 1) + ". " + notes.get(i));
//            }
//        }
//    }

//    static void editNote() {
//        Scanner scanner = new Scanner(System.in);
//
//        if (notes.isEmpty()) {
//            System.out.println("No notes available to edit.");
//            return;
//        }
//
//        System.out.println("Enter the number of the note you want to edit:");
//        int noteNumber = scanner.nextInt();
//
//        if (noteNumber >= 1 && noteNumber <= notes.size()) {
//            scanner.nextLine(); // Consume the newline character
//            String existingContent = notes.get(noteNumber - 1);
//
//            System.out.println("Edit contents on the note: " + existingContent);
//            String newContent = scanner.nextLine(); // Read the actual content
//            existingContent += ". " + newContent;
//            notes.set(noteNumber - 1, existingContent);
//            System.out.println("Note edited successfully.");
//        } else {
//            System.out.println("Invalid note number. No note edited.");
//        }
//    }

//    static void deleteNote() {
//        Scanner scanner = new Scanner(System.in);
//
//        if (notes.isEmpty()) {
//            System.out.println("No notes available to delete.");
//            return;
//        }
//
//        System.out.println("Enter the number of the note you want to delete:");
//        int noteNumber = scanner.nextInt();
//
//        if (noteNumber >= 1 && noteNumber <= notes.size()) {
//            String deletedNote = notes.remove(noteNumber - 1);
//            System.out.println("Note deleted successfully: " + deletedNote);
//        } else {
//            System.out.println("Invalid note number. No note deleted.");
//        }
//    }
//
//    static void viewNoteSize() {
//        System.out.println("Notes along with size:");
//        if (notes.isEmpty()) {
//            System.out.println("No notes available.");
//        } else {
//            for (int i = 0; i < notes.size(); i++) {
//                String note = notes.get(i);
//                int wordCount = countWords(note);
//                System.out.println((i + 1) + ". " + note + " (" + wordCount + " words)");
//            }
//        }
//    }
//
//    static int countWords(String text) {
//        String[] words = text.split("\\s+");
//        return words.length;
//    }


//class AddNote{};
//class ViewNote{};
//class EditNote{};
//class NoteSize{};
//class DeleteNote{};
