package core.basesyntax;
public class Ball {
    private String color;
    private int number;
    Ball ball = new Ball(number, color);
    public Ball(int number, String color) {
    }

    public Ball() {
    }

    @Override
    public String toString() {
        return "color" + this.color + "number" + this.number;
    }
}
