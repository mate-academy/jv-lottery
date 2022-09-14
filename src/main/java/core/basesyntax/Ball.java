package core.basesyntax;

public class Ball extends Lottery {
    String color;
    int number;

    @Override
    public String toString() {
        return color + " ball with number " + number;
    }

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
}
