package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
