package homeworkweek8;
//Program 16

public class Point {
    //Instance variables
    private int x;
    private int y;

    //Constructor

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Instance methods
    public double getX() {
        return x;

    }

    public double getY() {
        return y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
// This distance from point(0,0)
        return Math.sqrt((0 - this.getX()) * (0 - this.getX()) + (0 - this.getY()) * (0 - this.getY()));

    }
 // this distance form point(x,y)
    public double distance(int x, int y) {

        return Math.sqrt((x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()));
    }
  //This distance form point second point

    public double distance(Point second) {

        return Math.sqrt((second.getX() - this.getX()) * (second.getX() - this.getX()) + (second.getY() - this.getY()) * (second.getY() - this.getY()));

    }


    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }

}

