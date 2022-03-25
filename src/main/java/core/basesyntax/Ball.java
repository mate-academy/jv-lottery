package core.basesyntax;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String toString(String color,int number) {
        return (color + "-" + number);
    }
}
