package core.basesyntax;
public class Ball {
    private final int numberBall;
    private final String colorBall;

    public int getNumberBall() {
        return numberBall;
    }

    public String getColorBall() {
        return colorBall;
    }
    public Ball(String colorBall, int numberBall) {
        this.colorBall = colorBall;
        this.numberBall = numberBall;
    }

    @Override
    public String toString() {
        return "Color: " + getColorBall() + " and number: " + getNumberBall();
    }
}
