package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        ColorSupplier ballcolor = new ColorSupplier();
        Lottery ballwin = new Lottery();
        String win = ballwin.getRandomBall();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball(ballcolor.getRandomColor(),new Random().nextInt(100));
            if ((balls[i].getColor() + " " + balls[i].getNumber()).equals(win)) {
                System.out.println("You are win!");
            } else {
                System.out.println("Try again!");
            }
        }
        System.out.println(ballwin.getRandomBall());
    }
}
