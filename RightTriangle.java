class RightTriangle extends Shape {
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
public double getArea() {
    return 0.5 * firstLeg * secondLeg;
}
public void draw() {
    System.out.println("RightTriangle - Color: " + color + ", First Leg: " + firstLeg + ", Second Leg: " + secondLeg + ", Area: " + getArea());
}
}


