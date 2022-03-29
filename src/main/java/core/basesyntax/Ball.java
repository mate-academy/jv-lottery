package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getToString() {
        return "Color: " + color + ", number: " + number;
    }
}
