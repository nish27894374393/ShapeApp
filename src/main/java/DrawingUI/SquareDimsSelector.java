package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class SquareDimsSelector extends JPanel{
        JSlider sideSlider;
        int side;
        public SquareDimsSelector(){
            JPanel controls = new JPanel();
            JLabel label = new JLabel("Square Side");
            this.setLayout(new GridLayout(2,1));
            this.add(label);
            this.add(controls);

            this.sideSlider =new JSlider(JSlider.HORIZONTAL,0,100,30);
            this.add(sideSlider);

        }
        public int getSide(){
            side =sideSlider.getValue();
            return side;
        }

}
