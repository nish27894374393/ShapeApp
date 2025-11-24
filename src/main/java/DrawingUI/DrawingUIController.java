package DrawingUI;

import myShapes.Drawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    static JPanel mainPanel = new JPanel();
    Drawing myDrawing;
    ShapeSelector sSel;
    ColourSelector cSel;
    CircleDimsSelector circRadSel;
    SquareDimsSelector sideSel;
    RectDimSelector rdSel;
    Color currentColour;
    String currentShape;

    public DrawingUIController() {
        controlsPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setLayout(new GridLayout(2,1));
        this.myDrawing = new Drawing();
        this.sSel = new ShapeSelector();
        this.cSel = new ColourSelector();
        this.circRadSel = new CircleDimsSelector();
        this.rdSel = new RectDimSelector();
        this.sideSel = new SquareDimsSelector();

        myDrawing.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e){

            }

            @Override
            public void mousePressed(MouseEvent e){
            Point clickLoc = e.getPoint();
            currentShape = sSel.getCurrentShape();
            currentColour = cSel.getCurrentColour();
            if(currentShape.equals("Circle")){
                int circRad = circRadSel.getRadius();
                myDrawing.addCircle(clickLoc,currentColour,circRad);
                }
            else if (currentShape.equals("Rectangle")){
                int width = rdSel.getWidth();
                int height = rdSel.getHeight();
                myDrawing.addRect(clickLoc, currentColour,width,height);
                }
            else if (currentShape.equals("Square")){
                int side = sideSel.getSide();
                myDrawing.addSquare(clickLoc,currentColour,side);
                }
            myDrawing.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e){

            }

            @Override
            public void mouseEntered(MouseEvent e){

            }

            @Override
            public void mouseExited(MouseEvent e){

            }

        });


        controlsPanel.setLayout(new GridLayout(3,2));
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(circRadSel);
        controlsPanel.add(sideSel);
        controlsPanel.add(rdSel);

        mainPanel.add(controlsPanel);
        mainPanel.add(myDrawing);
    }

    static public JPanel getMainPanel(){
        return mainPanel;
    }
}
