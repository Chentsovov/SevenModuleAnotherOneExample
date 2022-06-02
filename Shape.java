package SevenModuleAnotherOne;
////Продумай иерархию классов. Здесь должны быть как минимум:
////
////базовый класс для фигуры Shape. Этот класс должен иметь метод для
//// вывода имени фигуры.
////классы-наследники - Circle, Quad и т.д. - не меньше 5 вариантов;
////должен быть класс, который принимает фигуру, и выводит ее название.
//// Класс должен работать именно с базовым классов Shape.
////Обрати внимание на использование интерфейсов, абстрактных классов,
//// модификаторов доступа.
////
////Нет единого правильного способа решения этой задачи. Попытайся
//// спроектировать гибкую архитектуру, задавая себе вопросы вида "А
//// что будет, если этот класс нужно будет менять? Что еще поменяется,
//// если здесь нужно будет расширить?".
public abstract class Shape {

//unique variables should be replaced to corresponding classes in future
    private final String name;
    private int yStart;
    private int xStart;
    private int yEnd;
    private int xEnd;
    private int incline;
    private boolean fill;
    private static int radius;
    private byte beams;

    public String getName() {
        return name;
    }

    protected Shape(String name, int xStart, int yStart, int radius , boolean fill) {
        //for circle
        this.name = name;
        this.xStart = xStart;
        this.yStart = yStart;
        this.radius = radius;
        this.fill = fill;
    }
    protected Shape(String name, int xStart, int yStart, int xEnd, int yEnd, boolean fill) {
        //for rectangle and oval
        this.name = name;
        this.xStart = xStart;
        this.yStart = yStart;
        this.fill = fill;
    }
    protected Shape(String name, int xStart, int yStart, int radius , byte beams, int incline, boolean fill) {
        //for polygone and star
        this.name = name;
        this.xStart = xStart;
        this.yStart = yStart;
        this.fill = fill;
        this.radius = radius;
    } //количество лучей - байт



    //------------------------------------------------------------
    public int getyStart() {
        return yStart;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public int getxStart() {
        return xStart;
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getIncline() {
        return incline;
    }

    public void setIncline(int incline) {
        this.incline = incline;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Shape.radius = radius;
    }

    public byte getBeams() {
        return beams;
    }

    public void setBeams(byte beams) {
        this.beams = beams;
    }
}