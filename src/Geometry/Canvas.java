package Geometry;

import javax.swing.*;
import java.awt.*;
import Shape.Circle;

public class Canvas extends JPanel {
    private Circle circle;
    public void addCircle(Circle c){
        this.circle= c;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
       g.drawOval(150,150,200,200);// only outline of a circle
       g.fillOval(10,10,100,100); //we can create an circle with this only but this creates a filled circle
    }
}
