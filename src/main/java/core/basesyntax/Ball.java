package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return getColor() + " ball with " + getNumber() + " number";
    }
}
