
class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
