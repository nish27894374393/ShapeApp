package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    JSlider radSlider;
    int radius;
    public CircleDimsSelector(){
        JPanel controls = new JPanel();
        JLabel label = new JLabel("Circle Radius");
        this.setLayout(new GridLayout(2,1));
        this.add(label);
        this.add(controls);

        this.radSlider =new JSlider(JSlider.HORIZONTAL,0,100,30);
        this.add(radSlider);

    }
    public int getRadius(){
        radius=radSlider.getValue();
        return radius;
    }
}
