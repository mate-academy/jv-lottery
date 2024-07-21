package core.basesyntax;

public class Ball {
    private final Color colorOfABall;
    private final int number;

    public Ball(Color color, int number) {
        this.colorOfABall = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.colorOfABall + " " + this.number;
    }
}
