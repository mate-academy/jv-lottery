package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return getColor() + "/n" + getNumber();
    }
}


