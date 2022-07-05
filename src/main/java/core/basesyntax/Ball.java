package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {
    }

    @Override
    public String toString() {
        return "color " + this.color + "/n" + "number " + this.number;
    }
}
