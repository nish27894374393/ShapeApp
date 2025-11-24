package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimSelector extends JPanel {
    JSlider widthSlider;
    JSlider heightSlider;
    int width;
    int height;
    public RectDimSelector(){
        JLabel label = new JLabel("Rect Side Controls");
        this.setLayout(new GridLayout(3,1));
        this.add(label);

        this.heightSlider =new JSlider(JSlider.HORIZONTAL,0,100,20);
        this.add(heightSlider);
        this.widthSlider =new JSlider(JSlider.HORIZONTAL,0,100,40);
        this.add(widthSlider);
    }
    public int getWidth(){
        width=widthSlider.getValue();
        return width;
    }
    public int getHeight(){
        height=heightSlider.getValue();
        return height;
    }
}
