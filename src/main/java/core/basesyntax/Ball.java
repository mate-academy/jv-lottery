package core.basesyntax;

public class Ball {
    public enum Colors{
        white,
        black,
        red,
        blue,
        green,
        brown,
        yellow
    }

    private final int NUMBER;
    private final Colors COLOR;

    public Ball(Colors color, int number) {
     this.COLOR = color;
     this.NUMBER = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + NUMBER +
                ", color=" + COLOR +
                '}';
    }

}
