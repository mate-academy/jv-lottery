package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    //constructors
    public Ball(String color, int number) {
        this.number = number;
        this.color = color;
    }

    public Ball() {
    }

    //getters and setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "";
    }
}
