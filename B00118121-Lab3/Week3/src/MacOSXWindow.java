// Concrete product B
// Concrete Product representing a MacOSX-style window.
public class MacOSXWindow extends Window{
  // Constructor initializes the window title
  MacOSXWindow(String text){
    this.title = text;
  }

  // Displays Mac-specific window styling
  public void repaint(){
    // Mac OSX specific behaviour
    System.out.println("Title: " + title);
    System.out.println("Window style: Mac OSX.");
  }
}






