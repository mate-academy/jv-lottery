package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setNumber(int n) {
        number = n;
    }

    public void setColor(Color c) {
        color = c;
    }

    @Override
    public String toString() {
        String ball = "ball";
        return ball;
    }
}
