public class Ball {
    private final String color;
    private final int number;

    protected Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "The color of the ball is: " + color + ", and the number of the ball is: " + number;
    }

}
