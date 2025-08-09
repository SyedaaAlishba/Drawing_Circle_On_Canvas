package Geometry;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import Shape.Circle;

public class Canvas extends JPanel {
    private Circle circle;
    private Image img;
    public void addCircle(Circle c){
        this.circle= c;
        repaint();
    }
    public Canvas() {
        try {
            // Load image from src folder (root of classpath)
            img = ImageIO.read(getClass().getResource("/lion.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Image not found. Check file name and location.");
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
//       g.drawOval(150,150,200,200);// only outline of a circle
//       g.fillOval(10,10,100,100); //we can create an circle with this only but this creates a filled circle
        if (img != null) {
            g.drawImage(img, 50, 50, this);
        }
    }
}
