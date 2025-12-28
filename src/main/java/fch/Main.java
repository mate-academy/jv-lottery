package fch;

import fch.models.Ball;
import fch.models.Lottery;

public class Main {
    public static void main(String[] args) {

        /*
        Program creates three instances of Ball class using getRandomBall method from the Lottery class.

        It prints information about each instance calling toString method.
         */

        Lottery lottery = new Lottery();

        for (int i = 0; i < 3; i++) {

            Ball randomBall = lottery.getRandomBall();

            System.out.println(randomBall.toString());

        }

    }
}
