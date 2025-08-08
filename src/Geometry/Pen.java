package Geometry;

import Location.Point;
import Shape.Circle;


public class Pen {
    private Point position;
    Canvas canvas;
    public Pen(Canvas cvs){
        this.position=new Point(0,0);
        this.canvas=cvs;
    }

    public void drawCircle(int radius) {
        // Create a circle with current position as center
        Circle circle = new Circle(new Point(position.getX(), position.getY()), radius);
        canvas.addCircle(circle);
    }
    public void moveTo(Point p){
        this.position=new Point(p);
    }
}
