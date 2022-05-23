public class main {

    public static void main(String[] args) {

        CircleType c = new CircleType(0,0,10);
        System.out.println("Detais for the provided circle: ");

        // change the radius
        c.setRadius(15);

        showCircleDetails(c);

        c.moveRight();
        System.out.println("\nMove right");
        showCircleDetails(c);

        c.moveLeft();
        System.out.println("\nMove left");
        showCircleDetails(c);

        c.moveUp();
        System.out.println("\nMove Up");
        showCircleDetails(c);

        c.moveDown();
        System.out.println("\nMove Down");
        showCircleDetails(c);
    }

    public static void showCircleDetails(CircleType c) {
        System.out.println("Circle X - coordinate: " + c.getX());
        System.out.println("Circle Y - coordinate: " + c.getY());

        System.out.println("Circle radius: " + c.getRadius());

        System.out.println("Circle area: " + c.calculateArea());

        System.out.println("Circumference: " + c.calculateCircumference());
    }
}