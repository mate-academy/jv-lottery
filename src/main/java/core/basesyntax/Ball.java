package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String randomColor, int number) {
        this.color = randomColor;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
