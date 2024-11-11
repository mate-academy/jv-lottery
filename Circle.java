    class Circle extends Shape {
        private double radius;
        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Circle - Color: " + color + ", Radius: " + radius + ", Area: " + getArea());
    }
}
