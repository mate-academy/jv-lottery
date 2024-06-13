package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
      Lottery ball1 = new Lottery();
      ball1.setNumber(ball1.getRandomBall());
        System.out.println("ball number:" + ball1.getNumber() + "     " + "ball color:" + ball1.getRandomColor());
      Lottery ball2 = new Lottery();
        ball2.setNumber(ball2.getRandomBall());
        System.out.println("ball number:" + ball2.getNumber() + "     " + "ball color:" + ball2.getRandomColor());
      Lottery ball3 = new Lottery();
        ball3.setNumber(ball3.getRandomBall());
        System.out.println("ball number:" + ball3.getNumber() + "     " + "ball color:" + ball3.getRandomColor());
    }
}
