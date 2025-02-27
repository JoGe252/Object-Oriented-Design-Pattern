public class Main {
  public static void main(String[] args) {
    // Instantiates the client
    GUIBuilder builder = new GUIBuilder();
    AbstractWidgetFactory widgetFactory = null;

    // Detects the OS and assign the appropriate factory
    String osName = System.getProperty("os.name").toLowerCase();

    if (osName.contains("mac")) {
      widgetFactory = new MacOSXWidgetFactory();
    } else if (osName.contains("win")) {
      widgetFactory = new MsWindowsWidgetFactory();
    } else { // Assumes Unix-like OS (Linux, Unix, etc.)
      widgetFactory = new UnixWidgetFactory();
    }

    // Builds and displays the window using the chosen factory
    builder.buildWindow(widgetFactory, "New Window");
  }
}






