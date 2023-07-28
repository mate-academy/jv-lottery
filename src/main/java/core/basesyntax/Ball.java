package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return "Your ball is " + color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumber() {
        return " and has number " + number;
    }

    @Override
    public String toString() {
        return "default";
    }
}
