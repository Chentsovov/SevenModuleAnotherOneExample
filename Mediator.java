package SevenModuleAnotherOne;

public class Mediator {

    public static String printer(Shape shape) {
        return shape.getName();
    } //как аргумент принимается именно класс без инициализации. пока не пойму , как это работает

    public static int area(Shape shape) {
//just example, to figure out how it works
        int area = 0;
        if (shape.getName().equals("circle")) {
            area = (int) (Math.pow((shape.getRadius()), 2) * 3.14);
            return area;
        }
//.... and further for each case
        return area;
    }

//    public String method (Shape shape) {
//        return shape.getName();
//    }
}
