package JavaPractice.Q9;

public class Circle extends Shape {
    private double radius;
    private final double PI=3.147;
    @Override
    protected void area(){
        super.area();
        System.out.println(2*PI*radius*radius);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
