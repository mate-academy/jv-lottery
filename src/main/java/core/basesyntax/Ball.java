package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    //creating getters and setters for variables color and number
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
        return "Ball with color " + color + ", number " + number;
    }
}
