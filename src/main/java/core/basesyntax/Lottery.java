package core.basesyntax;

public class Lottery extends Ball {
    public String getRandomBall() {
        return String.valueOf(getNumber()) + ", ball's color is: " + super.getColor().getRandomColor();
    }
}
