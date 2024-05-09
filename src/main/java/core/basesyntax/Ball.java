package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "You got from lottery " + color + " ball with number: " + number;
    }
}

