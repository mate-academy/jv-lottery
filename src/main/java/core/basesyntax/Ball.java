package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{number= " + number + ", color= '" + color + "'}";
    }
}
