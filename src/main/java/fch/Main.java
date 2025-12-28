package fch;

import fch.models.Ball;
import fch.models.Lottery;

public class Main {
    public static void main(String[] args) {

        /*
        Program creates three instances of Ball class using getRandomBall method from the Lottery class.

        It prints information about each instance calling toString method.
         */

        final int BALLS_AMOUNT = 3;

        for (int i = 0; i < BALLS_AMOUNT; i++) {

            Lottery lottery = new Lottery();

            Ball randomBall = lottery.getRandomBall();

            System.out.println(randomBall.toString());

        }

    }
}