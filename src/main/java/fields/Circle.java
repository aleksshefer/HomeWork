package fields;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
}
