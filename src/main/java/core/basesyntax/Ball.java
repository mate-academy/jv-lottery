package core.basesyntax;

public class Ball {
    enum Colors {
        RED,
        GREEN,
        YELLOW,
        BLUE,
        BLACK

    }

    private String color = "";
    private int number = 0;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
