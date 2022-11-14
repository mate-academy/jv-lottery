package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    private String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return getColor().toUpperCase() + " : " + getNumber();
    }
}
