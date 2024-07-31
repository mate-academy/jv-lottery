package ball.characteristics;

public class Ball {
    private final int number;
    private final String color;

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    public Ball(Ball ball) {
        this.color = ball.color;
        this.number = ball.number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "The color of the ball is " + getColor()
                + " and the number of the ball is  " + getNumber();
    }
}
