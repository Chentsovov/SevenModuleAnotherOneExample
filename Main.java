package SevenModuleAnotherOne;

public class Main {
    public static void main(String[] args) {
        //example for "circle"
        Circle circle = new Circle();
        System.out.println("Shape is " + Mediator.printer(circle));
        circle.setxStart(10); //setters are working
        circle.setyStart(21);
        System.out.println("Shape.radius = " + Shape.getRadius());
        System.out.println("Area of shape is " + Mediator.area(circle));

//                Mediator mediator = new Mediator();
//        mediator.method(circle);
    }
}
