package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(String color, int number){
        Ball ball = new Ball();
        int index = new Random().nextInt(Colors.values().length);
        int indexNumber = new Random().nextInt(100);
        return ball;
    }
}
