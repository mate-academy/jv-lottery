package core.basesyntax;

public class Ball {
    private String ballColor;
    private int ballNumber;

    public String getColor() {
        return ballColor;
    }

    public int getNumber() {
        return ballNumber;
    }

    public void setColor(String color) {
        this.ballColor = color;
    }

    public void setNumber(int number) {
        this.ballNumber = number;
    }

    @Override
    public String toString() {
        return ballColor + " " + ballNumber;
    }
}
