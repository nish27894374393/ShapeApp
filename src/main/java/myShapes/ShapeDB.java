package myShapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<myShape> shapeList= new ArrayList<>();
    void addSquare(Point pos, Color col, int side){
     Square mySquare = new Square(side,pos,col);
     shapeList.add(mySquare);
    }

    void addCircle(Point pos, Color col, int radius){
        Circle  myCircle = new Circle(radius,pos,col);
        shapeList.add(myCircle);
    }

    void addRect(Point pos, Color col, int w, int h){
        Rect myRect  = new Rect(w,h,pos,col);
        shapeList.add(myRect);
    }
    void drawShapes(Graphics g){
        for  (myShape s : this.shapeList) {
            s.draw(g);
        }
    }
}
