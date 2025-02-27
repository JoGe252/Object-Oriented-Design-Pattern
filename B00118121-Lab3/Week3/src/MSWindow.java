// Concrete product A
// Concrete Product representing an MS Windows-style window.
public class MSWindow extends Window{
  // Constructor initializes the window title
  MSWindow(String text){
    this.title = text;
  }

  // Displays Windows-specific window styling
  public void repaint(){
    // MS Windows specific behaviour
    System.out.println("Title: " + title);
    System.out.println("Window style: MS Windows.");
  }
}






