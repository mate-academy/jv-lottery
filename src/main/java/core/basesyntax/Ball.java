package core.basesyntax;

public enum Color {
    RED,
    GREEN,
    BLACK,
    WHITE,
    ORANGE,
    YELLOW,
    PURPLE,
    PINK
}

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        // System.out.println(color + String.valueOf(number));
        return color + String.valueOf(number);
    }

}