package core.basesyntax;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public Ball() {
    }

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
