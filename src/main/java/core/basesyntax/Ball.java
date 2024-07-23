package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball() {

    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---------------------").append("\n");
        stringBuilder.append("Ball color: ").append(color).append("\n");
        stringBuilder.append(" Number : ").append(number).append("\n");
        stringBuilder.append("---------------------").append("\n");
        return stringBuilder.toString();
    }
}
