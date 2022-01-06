package core.basesyntax;

public class Ball {
    public String color;
    public int number;

    @Override
    public String toString() {
        return "Ball  " +
                "colour is " + color +
                ", number = " + number +
                ".";
    }
}