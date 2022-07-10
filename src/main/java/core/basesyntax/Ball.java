package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public int getNumber() {
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Ball(String color, int number){
        setColor(color);
        setNumber(number);
    }

    public String toString() {
    return getColor() + " " + getNumber();
    }
}
