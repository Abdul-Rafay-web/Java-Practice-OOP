package JavaPractice.Q9;

import JavaPractice.Q8.A;

import java.util.ArrayList;

public class Main {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void calculateArea() {
        for (Shape s : shapes) {
            s.area();
        }
    }
    public static void main(String[] args){
        Main m = new Main();
        Circle circle=new Circle();
        circle.setRadius(2);
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(3);
        rectangle.setWidth(4);
        Square square=new Square();
        square.setLength(3);
        square.setWidth(3);
        ArrayList<Shape>shapes1=new ArrayList<>();
        shapes1.add(square);
        shapes1.add(rectangle);
        shapes1.add(circle);
        m.setShapes(shapes1);
        m.calculateArea();
    }
}
