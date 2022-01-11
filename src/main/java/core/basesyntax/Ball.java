package core.basesyntax;

public class Ball {

    private int number;
    private String color;

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

    public void getBallInfo() {
        System.out.println("Ball is " + this.getColor() + " with number " + this.getNumber());
    }
}
