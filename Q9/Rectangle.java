package JavaPractice.Q9;

public class Rectangle extends Shape {
    private double length;
    private double width;
    @Override
    protected void area(){
        super.area();
        System.out.println(length*width);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
