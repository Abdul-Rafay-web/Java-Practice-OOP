package JavaPractice.Q8;

public class B extends A {
    @Override
    public void hello(){
        System.out.println("B says Hello");
    }
    public void bye(){
        System.out.println("B says bye");
    }
    public static void main(String []args){
        A obj=new B();
        obj.hello();
        obj=new B();
        obj.hello();
    }
}
