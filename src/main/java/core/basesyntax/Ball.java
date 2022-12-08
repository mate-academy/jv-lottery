package core.basesyntax;

public class Ball {
    private Colors color;
    private int num;

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Colors getColor() {
        return color;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return "Ball{color = " + getColor()
                + ", number = " + getNum() + "}";
    }
}
