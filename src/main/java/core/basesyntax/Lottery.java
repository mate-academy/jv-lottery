package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier param = new ColorSupplier();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        int numb = random.nextInt(100);
        //ball.setNumber(random.nextInt(100));
        String col = param.getRandomColor();
        //ball.setColor(a.getRandomColor());
        System.out.println(ball.toString(col,numb));
        return null;
    }
}
