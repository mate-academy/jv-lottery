package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(String lotteryColor) {
        this.color = lotteryColor;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "color " + color + " number " + number;
    }
}
