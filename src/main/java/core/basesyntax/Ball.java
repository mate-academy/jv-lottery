package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public int getNumber() {
        return this.number;
    }

    public String getColor() {
        return this.color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Number of Ball: " + this.number
                 + ", color of Ball: " + this.color;
    }
}

