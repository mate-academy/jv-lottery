package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball {"
             + "number = " + number
             + ", color = '" + color + '\''
             + '}';
    }
}
