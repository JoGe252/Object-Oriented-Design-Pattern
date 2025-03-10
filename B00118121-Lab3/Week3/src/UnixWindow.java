// New class I added to represent a Unix window
// Concrete Product representing a Unix-style window.
public class UnixWindow extends Window {
    UnixWindow(String text) {
        this.title = text;
    }

    public void repaint() {
        System.out.println("Title: " + title);
        System.out.println("Window style: Unix.");
    }
}
