// New class I added to handle Unix windows
// Concrete Factory for creating Unix-specific UI elements.
public class UnixWidgetFactory extends AbstractWidgetFactory {
    public Window createWindow(String title) {
        return new UnixWindow(title);
    }
}
