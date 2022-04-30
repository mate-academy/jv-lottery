package core.basesyntax;

public class Ball {
    public final Colors COLOR;
    public final int number;

    public Ball(Colors COLOR, int number) {
        this.COLOR = COLOR;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" + "COLOR=" + COLOR + ", number=" + number + '}';
    }
}
