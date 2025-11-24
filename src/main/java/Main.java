import DrawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawingUIController myDrawingController = new DrawingUIController();

        frame.setSize(500,600);
        JPanel appMainPanel = myDrawingController.getMainPanel();
        frame.getContentPane().add(appMainPanel);
        frame.setVisible(true);
        frame.addWindowListener((new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        }));
    }
}
