package core.basesyntax;

public class Lottery extends Ball {
    public String getRandomBall() {
        return getColor() + " ball with number " + getNumber();
    }
}
