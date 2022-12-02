package core.basesyntax;

public class Lottery extends Ball {
    public String getRandomBall() {
        setRandomColor();
        setRandomNumber();
        return super.toString();
    }
}
