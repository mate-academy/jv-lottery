package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color,int number) {
        this.color = color;
        this.number = number;
    }

    public Ball() {

    }

    public enum ColorEnum {
        RED,
        WHITE,
        GREEN,
        YELLOW,
        BLUE,
        BLACK
    }

    public String toString() {
        return color + " " + number;
    }
}
