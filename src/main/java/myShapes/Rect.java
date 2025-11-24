package myShapes;

import java.awt.*;

public class Rect extends myShape {
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

        protected void draw(Graphics inputGraphic){
            inputGraphic.setColor(col);
            inputGraphic.fillRect(loc.x, loc.y, width, height);

        }
    }


