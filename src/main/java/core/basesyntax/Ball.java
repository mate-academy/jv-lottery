package core.basesyntax;

public class Ball extends Lottery {
    private int number = getRandomBall();
    private String color = getRandomColor();

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color + '\'' + '}';
    }
}
