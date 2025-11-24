package myShapes;

import java.awt.*;

public class Rect implements myShape {
        private int width;
        private int height;
        private Point loc;
        private Color col;

        public Rect(int width,int height, Point loc, Color col) {
            this.loc = loc;
            this.col = col;
            this.width = width;
            this.height = height;
        }

        public void draw(Graphics inputGraphic){
            inputGraphic.setColor(col);
            inputGraphic.fillRect(loc.x, loc.y, width, height);

        }
    }


