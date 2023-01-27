package core.basesyntax;

public class Ball {

    private String color;
    private int number;
    private Loterry lottery = new Loterry();

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
        return "Number and color: " + lottery.getRandomBall();
    }
}
