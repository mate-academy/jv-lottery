package core.basesyntax;

import java.util.Random;

public class Lottery {
    public int getRandomNumber() {
        return new Random().nextInt(100);
    }
    public String getRandomColor(){
        ColorSupplier colorSupplier = new ColorSupplier();
       return colorSupplier.getRandomColor();
    }
    public void getRandomBall() {
        Ball ball = new Ball(getRandomColor(), getRandomNumber());
        ball.toString();
    }
}
