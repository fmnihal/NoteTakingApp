public class NoteSize implements NoteAction, View {
    @Override
    public void execute() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Notes along with size:");
        if (NoteTakingApp.notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            for (int i = 0; i < NoteTakingApp.notes.size(); i++) {
                System.out.println((i + 1) + ". " + NoteTakingApp.notes.get(i) + " (Size: " + NoteTakingApp.notes.get(i).length() + ")");
            }
        }
    }
}
