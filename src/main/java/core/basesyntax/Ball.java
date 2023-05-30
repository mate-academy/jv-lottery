package core.basesyntax;

public class Ball {
    private static int number;
    private String color;

    public Ball(String color) {
        this.color = color;
        Ball.number++;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
