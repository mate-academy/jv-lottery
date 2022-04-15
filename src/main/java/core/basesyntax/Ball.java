package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(Color c) {
        this.color = color;
    }

    @Override
    public String toString() {
        String ball = "ball";
        return "Ball with number:  " +  number +  " and color: " + color;
    }
}
