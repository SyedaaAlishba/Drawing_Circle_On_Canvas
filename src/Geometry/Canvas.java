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
        if (circle != null) {
            int x = (int) (circle.getCenter().getX() - circle.getRadius());
            int y = (int) (circle.getCenter().getY() - circle.getRadius());
            int diameter = circle.getRadius() * 2;

            g.drawOval(x, y, diameter, diameter);
        }
    }
}
