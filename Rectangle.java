class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public void draw() {
        System.out.println("Rectangle - Color: " + color + ", Width: " + width + ", Height: " + height + ", Area: " + getArea());
    }
}
