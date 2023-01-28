package core.basesyntax;

public class Ball {
    private Color color = null;

    private int number = 0;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball's color: "
                + color.toString() 
                + ", number: " + number;
    }
}
