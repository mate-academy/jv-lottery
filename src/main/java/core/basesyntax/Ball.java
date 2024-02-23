package core.basesyntax;

public class Ball extends Lottery {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball: "
                + "color = " + color
                + ", number = " + number;
    }
}
