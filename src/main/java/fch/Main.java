package fch;

import fch.models.Ball;
import fch.models.Lottery;

public class Main {
    static void main() {

        /*
        Program creates three instances of Ball class using getRandomBall method from the Lottery class.

        It prints information about each instance calling toString method.
         */

        Ball randomBall1 = Lottery.getRandomBall();

        Ball randomBall2 = Lottery.getRandomBall();

        Ball randomBall3 = Lottery.getRandomBall();

        System.out.println(randomBall1.toString());

        System.out.println(randomBall2.toString());

        System.out.println(randomBall3.toString());

    }
}
