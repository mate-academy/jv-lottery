package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setBall(String color,int number) {
        this.color = color;
        this.number = number;
    }

    public String toString() {
        return "Color = " + color + " numer = " + number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
