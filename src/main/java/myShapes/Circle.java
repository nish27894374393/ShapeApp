package myShapes;

import java.awt.*;

public class Circle implements myShape {
    private int rad;
    private Point loc;
    private Color col;

    public Circle(int rad, Point loc, Color col) {
        this.loc = loc;
        this.col = col;
        this.rad  = rad;
    }

    @Override
    public void draw(Graphics inputGraphic) {
        inputGraphic.setColor(col);
        inputGraphic.fillOval(loc.x, loc.y, rad, rad);
    }
}
