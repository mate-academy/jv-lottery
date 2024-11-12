class Square extends Shape {
    private double side;
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
public double getArea() {
    return side * side;
}
public void draw() {
    System.out.println("Square - Color: " + color + ", Side: " + side + ", Area: " + getArea());
}
}
