package DrawingUI;

import javax.swing.*;

public class ShapeSelector  extends JPanel {
    private JRadioButton CircleButton;
    private JRadioButton SquareButton;
    private JRadioButton RectButton;
    private ButtonGroup buttons;

    public ShapeSelector(){
        buttons = new ButtonGroup();
        CircleButton = new JRadioButton("Circle");
        SquareButton = new JRadioButton("Square");
        RectButton = new JRadioButton("Rectangle");
        CircleButton.setSelected(true);

        buttons.add(CircleButton);
        buttons.add(SquareButton);
        buttons.add(RectButton);

        this.add(CircleButton);
        this.add(SquareButton);
        this.add(RectButton);
    }

    public String getCurrentShape(){
        if (CircleButton.isSelected()){
            return "Circle";
        }
        else if (SquareButton.isSelected()){
            return "Square";
        }
        else if (RectButton.isSelected()){
            return "Rectangle";
        }
        else return null;
    }
}
