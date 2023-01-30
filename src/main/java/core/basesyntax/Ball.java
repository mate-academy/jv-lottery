package core.basesyntax;

public class Ball {
    public Colors color;
    public int number;

    public Ball (Colors c, int i) {
        this.color = c;
        this.number = i;
    }

    @Override
    public String toString() {
        return color + " " + number;
    }
}
