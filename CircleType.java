public class CircleType extends PointType{
    int radius;

    public CircleType(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    double pi = 3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double printRadius() {
        double r = this.getRadius();
        System.out.println(r);
        return r;
    }

    public double calculateArea() {
        double r = this.getRadius();
        return pi * r * r;
    }

    public double calculateCircumference() {
        double r = this.getRadius();
        return 2 * pi * r;
    }

    public void moveLeft() {
        setX(getX()-1);
    }

    public void moveRight() {
        setX(getX()+1);
    }

    public void moveUp() {
        setY(getY()+1);
    }

    public void moveDown() {
        setY(getY()-1);
    }

}
