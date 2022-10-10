package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setBall(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color + " " + this.number;
    }

}
