package core.basesyntax;

public class Ball {
    private Color ballColor;
    private int number;

    public Color getBallColor() {
        return ballColor;
    }

    public int getNumber() {
        return number;
    }

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "ballColor=" + ballColor
                +
                ", number=" + number
                +
                '}';
    }
}
