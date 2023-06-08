package core.basesyntax;

public class Ball extends Lottery {
    private String color;
    private int number;

    @Override
    public String toString() {
        return getRandomBall();
    }
}
