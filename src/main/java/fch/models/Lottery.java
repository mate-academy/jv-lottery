package fch.models;

import java.util.Random;

public class Lottery {

    /*
    Lottery generates a Ball instance with getRandomBall method.

    The method generates a random Integer (0-100) and calls getRandomColor method from ColorSupplier class.
     */

    private final int RANGE = 101;

    private ColorSupplier cs = new ColorSupplier();

    int number = new Random().nextInt(RANGE);

    public Ball getRandomBall() {

        return new Ball(cs.getRandomColor(), number);

    }
}
