package IntroductionInOOP;
import org.apache.commons.lang3.StringUtils;
class Point {
    private double x;
    private double y;

    Point(double coordinateX, double coordinateY) {
        this.x = coordinateX;
        this.y = coordinateY;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
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

class User {
    private int userId;
    private String userNickname;

    User(int userId, String userNickname) {
        this.userId = userId;
        this.userNickname = userNickname;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public boolean isEqual(User anotherUser) {

        return anotherUser.getUserId() == this.getUserId();
    }

}

class App2 {

    public static String getFigureSquare(Geometric geometric) {
        return "Square of " + geometric.getName() + " is " + geometric.getSquare();
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(StringUtils.reverse(str));
    }

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

        Geometric quadrate = new Quadrate(5);
        System.out.println(App2.getFigureSquare(quadrate));// "Square of quadrate is 25"

//        var user1 = new User(12, "Nick12");
//        var user2 = new User(1, "Nick12");
//        System.out.println(user1.isEqual(user2)); // true
////        var point1 = new Point(4, 3);
//        var point2 = new Point(6, 1);
//        var midPoint = App2.getMidPoint(point1, point2);
//        System.out.println(midPoint.getX()); // 5
//        System.out.println(midPoint.getY()); // 2
//        var circle = new Circle(1, 2, 5);
//        System.out.println(App2.getCircumference(circle));
    }

}
