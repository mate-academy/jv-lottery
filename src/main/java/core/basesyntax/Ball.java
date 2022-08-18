package core.basesyntax;

public class Ball extends Lottery {
    private int number;
   private String color;

    public Ball() {}

    public Ball(String color,int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{ " + "color = '" + color + '\'' + ", number = " + number + '}';
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
}
