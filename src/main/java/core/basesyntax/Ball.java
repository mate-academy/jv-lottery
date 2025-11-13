package core.basesyntax;

public class Ball {
    Colors color;
    int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball {" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
