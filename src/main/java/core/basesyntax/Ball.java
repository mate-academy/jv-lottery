package core.basesyntax;

public class Ball {
    public String color;
    public int integer;

    public Ball(String color, int integer) {
        this.color = color;
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "color : " + color + ";  int : " + integer;
    }
}
