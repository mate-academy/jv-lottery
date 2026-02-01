package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {

    }

    public Ball(String res, int num) {
        this.color = res;
        this.number = num;
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

    public String toString() {
        return ("Color : " + this.color + ",Number : " + this.number);
    }
}
