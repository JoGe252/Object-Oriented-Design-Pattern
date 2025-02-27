// ConcreteFactory1
// Concrete Factory for creating MS Windows-specific UI elements.
public class MsWindowsWidgetFactory extends AbstractWidgetFactory{
  // create an MSWindow
  // Creates and returns an MSWindow instance
  public Window createWindow(String title){
    return new MSWindow(title);
  }
}





