package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(Color c, int number) {
        this.color = c;
        this.number = number;
    }

    public String toString() {
        return this.color.toString() + " " + this.number;
    }
}
