package IntroductionInOOP;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
class Circle {
    public int x;
    public int y;
    public int radius;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

}

class App2 {

    public static Point getMidPoint(Point point1,  Point point2) {
        var newPointX = (point1.getX() + point2.getX()) / 2;
        var newPointY = (point1.getY() + point2.getY()) / 2;
        return new Point(newPointX, newPointY);
    }



    public static Point getSymmetricalPoint(Point point) {
        return new Point(point.getX(), -point.getY());
    }
    public static double getCircumference(Circle obCircle) {
        return obCircle.radius*2*Math.PI;
    }

    public static void main(String[] args) {

        var point1 = new Point(4, 3);
        var point2 = new Point(6, 1);
        var midPoint = App2.getMidPoint(point1, point2);
        System.out.println(midPoint.getX()); // 5
        System.out.println(midPoint.getY()); // 2



        var circle = new Circle(1, 2, 5);
        System.out.println(App2.getCircumference(circle));
    }

}
