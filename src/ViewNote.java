public class ViewNote implements NoteAction {
    @Override
    public void execute() {
        System.out.println("Your Notes:");
        if (NoteTakingApp.notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            for (int i = 0; i < NoteTakingApp.notes.size(); i++) {
                System.out.println((i + 1) + ". " + NoteTakingApp.notes.get(i));
            }
        }
    }
}







//import java.util.Scanner;
//public class ViewNote {
//    static void viewNotes() {
//        System.out.println("Your Notes:");
//        if (NoteTakingApp.notes.isEmpty()) {
//            System.out.println("No notes available.");
//        } else {
//            for (int i = 0; i < NoteTakingApp.notes.size(); i++) {
//                System.out.println((i + 1) + ". " + NoteTakingApp.notes.get(i));
//            }
//        }
//    }
//}
