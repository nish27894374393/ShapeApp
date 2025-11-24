import myShapes.*;

import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private ArrayList<myShape> shapeList= new ArrayList<>();
    public Drawing(Circle myCircle, Rect myRectangle) {
        shapeList.add(myCircle);
        shapeList.add(myRectangle);
    }

    public void paint(Graphics g) {
        for  (myShape s : shapeList) {
            s.draw(g);
        }

    }
}
