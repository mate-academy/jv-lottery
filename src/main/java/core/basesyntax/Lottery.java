package core.basesyntax;

import core.basesyntax.Ball;

import java.util.Random;

public class Lottery extends Ball {

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.getNumber();
        newBall.getColor();
        return newBall;
    }

    @Override
    public String toString() {
        return "Lottery{}";
    }
}
