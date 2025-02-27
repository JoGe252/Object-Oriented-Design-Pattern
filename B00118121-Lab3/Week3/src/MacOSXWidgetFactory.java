// ConcreteFactory2
// Concrete Factory for creating MacOSX-specific UI elements
public class MacOSXWidgetFactory extends AbstractWidgetFactory{
  // create a MacOSXWindow
  // Creates and returns a MacOSXWindow instance
  public Window createWindow(String title){
    return new MacOSXWindow(title);
  }
}






