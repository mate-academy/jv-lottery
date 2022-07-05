package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(int number, int index) {
        this.number = number;
        this.color = Color.values()[index];
    }

    @Override
    public String toString() {
        return "Color " + this.color + ". Number " + this.number + ".";
    }
}
