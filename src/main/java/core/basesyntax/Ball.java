package core.basesyntax;

public class Ball extends Lottery {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " ball with number " + number;
    }
}
