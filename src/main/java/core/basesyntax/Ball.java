package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String colorBall, int numberBall) {
        this.color = colorBall;
        this.number = numberBall;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
