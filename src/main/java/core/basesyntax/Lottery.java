package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier param = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        //int numb = random.nextInt(100);
        //String col = param.getRandomColor();
        //System.out.println(ball.toString(col,numb));
        ball.setNumber(random.nextInt(100));
        ball.setColor(param.getRandomColor());
        return ball;
    }
}
