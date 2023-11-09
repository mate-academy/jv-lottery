package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(String color) {
        this.color = ColorSupplier.getRandomColor();
    }

    public void setNumber(int number) {
        this.number = Lottery.getRandomBall().number;
    }

    public int getNumber() {
        return Lottery.getRandomBall().number;
    }

    public String getColor() {
        return ColorSupplier.getRandomColor();
    }

    @Override
    public String toString() {
        return "Ball " + "color: " + getColor() + ", ball number: " + getNumber();
    }
}
