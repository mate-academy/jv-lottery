package fch.models;

import java.util.Random;

public class Lottery {

    /*
    Lottery generates a Ball instance with getRandomBall method.

    The method generates a random Integer (0-100) and calls getRandomColor method from ColorSupplier class.
     */

    private ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {

        Color color = cs.getRandomColor();

        int number = new Random().nextInt(101);

        Ball ball = new Ball(color, number);

        return ball;

    }
}
