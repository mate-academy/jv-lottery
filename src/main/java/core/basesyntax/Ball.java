package core.basesyntax;

public class Ball {
    private int ballNumber;
    private Color[] ballColors = Color.values();
    private Color ballColor;

    public Ball(int ballNumber, Color ballColor) {
        this.ballNumber = ballNumber;
        this.ballColor = ballColor;
    }

    public Ball() {
    }

    public Color[] getBallColors() {
        return ballColors;
    }

    public Color getColorByIndex(int index) {
        if (index >= 0 && index < ballColors.length) {
            return ballColors[index];
        }
        return null;
    }

    public void setBallColors(Color[] ballColors) {
        this.ballColors = ballColors;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    @Override
    public String toString() {
        return "Ball { "
                + "color = " + ballColor + ",\n"
                + "number = " + ballNumber
                + " }";
    }
}
