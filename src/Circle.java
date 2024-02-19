public class Circle {

    double radius = 10;

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
    }
}
