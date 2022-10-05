package class01;

class CCircle {
    private double pi = 3.14159;

    public double Cal_area(int r) {
        return Math.round((4.0 / 3.0) * pi * r * r * r * 10.0) / 10.0;
    }
}

class CRectangle extends CCircle {
    public int Cal_area(int a, int b, int c) {
        return ((a * b) + (b * c) + (a * c)) * 2;
    }
}

public class class01 {
    public static void main(String[] args) {
        CCircle circle = new CCircle();
        System.out.println(circle.Cal_area(10));
        CRectangle rectangle = new CRectangle();
        System.out.println(rectangle.Cal_area(4, 5, 6));
    }

}