package core.basesyntax;

public class Ball {
    private String color;
    private Integer number;

    public Ball(String color, Integer number) {
        this.color = color;
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
