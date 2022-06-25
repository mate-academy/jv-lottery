package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.setColor(color);
        this.setNumber(number);
    }

    @Override
    public String toString() {
        return "Ball{color= '" + getColor() + "', Number= " + getNumber() + "}";
    }

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
}

// create Ball class with the following fields: color and number and override toString() method
