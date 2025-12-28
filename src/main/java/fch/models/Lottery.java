package fch.models;

import java.util.Random;

public class Lottery {

    /*
    Lottery generates a Ball instance with getRandomBall method.

    The method generates a random Integer (0-100) and calls getRandomColor method from ColorSupplier class.
     */

    public static Ball getRandomBall() {

        Color color = ColorSupplier.getRandomColor();

        int number = new Random().nextInt(101);

        Ball ball = new Ball(color, number);

        return ball;

    }
}
