package myShapes;

import java.awt.*;

public class Drawing extends Canvas {
    private ShapeDB myShapesDB; 
    public Drawing() {
        this.myShapesDB = new  ShapeDB();
        this.setBackground(Color.white);
    }
    
    public void addCircle(Point pos, Color col, int radius){
        myShapesDB.addCircle(pos,col,radius);
    };
    public void addSquare (Point pos, Color col, int side){
        myShapesDB.addSquare(pos,col,side);
    }
    public void addRect(Point pos, Color col, int w, int h){
        myShapesDB.addRect(pos,col,w,h);
    }
    public void paint(Graphics g) {
        myShapesDB.drawShapes(g);
    }
}
