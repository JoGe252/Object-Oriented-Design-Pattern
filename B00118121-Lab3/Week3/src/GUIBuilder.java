// Client class that uses the Abstract Factory to create GUI elements.
public class GUIBuilder{
  // Method to build and display a window using the given factory.
  public void buildWindow(AbstractWidgetFactory widgetFactory, String title){
    // Uses the factory to create a window object
    Window window = widgetFactory.createWindow(title);
    // Calls the repaint method to display the window with the correct style
    window.repaint();
  }
}




