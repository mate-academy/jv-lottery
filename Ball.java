public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "The color of the ball is: " + color + ", the number of the ball is: " + number;
    }

}
