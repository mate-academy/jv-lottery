package core.basesyntax;

public class Ball {
    public String color;
    public int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }

}
