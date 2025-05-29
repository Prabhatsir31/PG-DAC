// MouseHandler interface
interface MouseHandler {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
}

// WindowHandler interface
interface WindowHandler {
    void windowClosing();
    void windowClosed();
}

// WindowGUIApp class implementing both interfaces
class WindowGUIApp implements MouseHandler, WindowHandler {
    // Implementing MouseHandler methods
    @Override
    public void mouseClicked() {
        System.out.println("Mouse clicked.");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse pressed.");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse released.");
    }

    // Implementing WindowHandler methods
    @Override
    public void windowClosing() {
        System.out.println("Window closing.");
    }

    @Override
    public void windowClosed() {
        System.out.println("Window closed.");
    }
}

// GUIDemo class with main method
public class GUIDemo {
    public static void main(String[] args) {
        // Create the object of WindowGUIApp
        WindowGUIApp app = new WindowGUIApp();

        // Invoke all the methods
        app.mouseClicked();
        app.mousePressed();
        app.mouseReleased();
        app.windowClosing();
        app.windowClosed();
    }
}