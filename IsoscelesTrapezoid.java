class IsoscelesTrapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;
    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;


        this.height = height;
    }
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    public void draw() {
        System.out.println("IsoscelesTrapezoid - Color: " + color + ", Base1: " + base1 + ", Base2: " + base2 + ", Height: " + height + ", Area: " + getArea());
    }
}
