package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball() {
    }

    public enum Color {
        BLACK,
        BLUE,
        YELLOW,
        WHITE,
        RED
    }

    @Override
    public String toString() {
        return "Ball"
                + "Color= '"
                + color
                + "' "
                + "number= '"
                + number
                + "' "
                + "}";
    }
}
