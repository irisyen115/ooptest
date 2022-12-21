interface IArea {
    void area();
}

class Circle implements IArea {
    private double radious;

    public Circle(double r) {
        this.radious = r;
    }

    public void area() {
        System.out.println("圓形面積: " + 3.1416 * radious * radious);
    }
}

class Rectangle implements IArea {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public void area() {
        System.out.println("長方形面積: " + width * height);
    }
}

class Triangle implements IArea {
    private double height;
    private double bottom;

    public Triangle(double h, double b) {
        this.height = h;
        this.bottom = b;
    }

    public void area() {
        System.out.println("三角形面積: " + (bottom * height) / 2);
    }
}

public class J3 {

    public static void main(String[] args) {
        IArea a;
        Circle c = new Circle(6.0);
        Rectangle r = new Rectangle(10.0, 15.0);
        Triangle t = new Triangle(20.0, 15.0);
        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                a = c;
            else if (i == 2)
                a = r;
            else
                a = t;
            a.area();
        }
    }
}
