package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(String color, int number) {
        this.color = Colors.valueOf(color);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
