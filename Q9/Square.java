package JavaPractice.Q9;

public class Square extends Rectangle {
    @Override
    public void area() {
        if (getLength() == getWidth()) {
            super.area();
        }
        else {
            System.out.println("Length and width are not same");
        }
    }
}
