package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Ball number is : " + number + "\nBall color is : " + color;
    }
}

