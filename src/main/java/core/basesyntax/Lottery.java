package core.basesyntax;

import java.util.Random;

public class Lottery {

    public void getRandomBall() {

        for (int i = 0; i < 3; i++) {

            Ball ball = new Ball();
            Random random = new Random();
            ColorSupplier supplier = new ColorSupplier();
            ball.setNumber(random.nextInt(100));
            ball.setColor(supplier.getRandomColor().toString());
            System.out.println("Ball color is: " + ball.getColor() + " ball number is: " + ball.getNumber());
        }
    }
}
