package org.example;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i < 4; i++) {
            Ball ball = lottery.getRandomBall();
            if (i == 1) {
                System.out.print(i + "st ");
            } else if (i == 2) {
                System.out.print(i + "nd ");
            } else if (i == 3) {
                System.out.print(i + "rd ");
            }
            System.out.println(ball);
        }
    }
}
