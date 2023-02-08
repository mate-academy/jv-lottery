package core.basesyntax;

public class Ball {
    private String color;
    private int num;

    public Ball(String color,int num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + " \n" + "Number: " + getNum() + "\n";
    }
}
