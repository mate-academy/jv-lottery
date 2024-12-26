package core.basesyntax;

public class Ball {
    Color color;
    Integer number;

    public Ball(Color color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color.toString() + this.number.toString();
    }
}
