package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(new Random().nextInt(100));
        ball.setColor(new ColorSupplier().getRandomColor());
        System.out.print("Ball has a number: " + ball.getNumber() + " and color: " + ball.getColor());
        return ball;
        }
    }


